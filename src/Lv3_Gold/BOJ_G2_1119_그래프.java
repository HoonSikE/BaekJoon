package Lv3_Gold;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/1119
 */
public class BOJ_G2_1119_그래프 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;
    static int num;
    // 깊이 우선 탐색(dfs)
    public static int dfs(int idx){
        int depth = 1;
        ArrayList<Integer> array = graph.get(idx);
        for(int i = 0; i < array.size(); i++){
            // 다음 nextIdx가 유효하다면 다음 검사
            int nextIdx = array.get(i);
            if(!isVisited[nextIdx]) {
                isVisited[nextIdx] = true;
                depth += dfs(nextIdx);
            }
        }
        return depth;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        // 그래프 기본 틀 생성
        graph = new ArrayList<>();
        for (int n = 0; n < N; n++)
            graph.add(new ArrayList<>());

        isVisited = new boolean[N];

        // 그래프 추가
        for (int n = 0; n < N; n++){
            String s = br.readLine();
            for(int m = 0; m < s.length(); m++) {
                if (s.charAt(m) == 'Y') {
                    graph.get(n).add(m);
                    graph.get(m).add(n);
                }
            }
        }

        // 정렬
        for(ArrayList<Integer> array : graph)
            Collections.sort(array);

        // dfs 탐색으로 연결된 도시의 합 계산
        num = 0;
        for(int n = 0; n < N; n++){
            if(!isVisited[n]) {
                dfs(n);
                num++;
            }
        }

        // 방문하지 않은 독립된 도시 체크
        for(int n = 0; n < N; n++)
            if(!isVisited[n])
                num++;

        // 도로 수정 개수
        str.append(num-1);

        System.out.print(str);
        br.close();
    }
}
