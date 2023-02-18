package Lv3_Gold;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2251
 */
public class BOJ_G5_2251_물통 {
    static int A, B, C;
    static ArrayList<Integer> result = new ArrayList<>();
    static class Bottle{
        int a;
        int b;
        int c;

        public Bottle(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public static void bfs(){
        Queue<Bottle> queue = new LinkedList<>();
        boolean[][][] isVisited = new boolean[A+1][B+1][C+1];

        // 초기 상태
        queue.add(new Bottle(0, 0, C));

        while(!queue.isEmpty()){
            Bottle current = queue.poll();
            // 현재 상태에서 체크한 적이 있다면 continue;
            if(isVisited[current.a][current.b][current.c]) continue;

            // 첫 번째 물통이 비어 있을 때, 세 번째 물통에 담겨있을 수 있는 물의 양 추가
            if(current.a == 0)
                result.add(current.c);

            isVisited[current.a][current.b][current.c] = true;

            // A->B
            if (current.a + current.b <= B)
                queue.add(new Bottle(0, current.a + current.b, current.c));
            else
                queue.add(new Bottle(current.a + current.b - B, B, current.c));
            // A->C
            if (current.a + current.c <= C)
                queue.add(new Bottle(0, current.b, current.a + current.c));
            else
                queue.add(new Bottle(current.a + current.c - C, current.b, C));
            // B->A
            if (current.a + current.b <= A)
                queue.add(new Bottle(current.a + current.b, 0, current.c));
            else
                queue.add(new Bottle(A, current.a + current.b - A, current.c));
            // B->C
            if (current.b + current.c <= C)
                queue.add(new Bottle(current.a, 0, current.b + current.c));
            else
                queue.add(new Bottle(current.a, current.b + current.c - C, C));
            // C->A
            if (current.a + current.c <= A)
                queue.add(new Bottle(current.a + current.c, current.b, 0));
            else
                queue.add(new Bottle(A, current.b, current.a + current.c - A));
            // C->B
            if (current.b + current.c <= B)
                queue.add(new Bottle(current.a, current.b + current.c, 0));
            else
                queue.add(new Bottle(current.a, B, current.b + current.c - B));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 세 정수 A, B, C (물병의 최대 용량)
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        bfs();

        Collections.sort(result);
        for(int n : result)
            str.append(n + " ");

        System.out.print(str);
        br.close();
    }
}
