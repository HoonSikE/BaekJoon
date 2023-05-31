package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2606
 */
public class BOJ_S3_2606_바이러스 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;
    static int cnt;
    // dfs
    public static void dfs(int start){
        if(check[start])
            return;

        check[start] = true;

        for(int i = 0 ; i < graph.get(start).size(); i++){
            int next = graph.get(start).get(i);
            if(!check[next]){
                cnt++;
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 컴퓨터의 수
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        check = new boolean[N+1];

        for(int n = 0; n < N+1; n++)
            graph.add(new ArrayList<>());

        for (int m = 0; m < M; m++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 양방향(무방향) 입력
            graph.get(i).add(j);
            graph.get(j).add(i);
        }

        cnt = 0;

        dfs(1);

        str.append(cnt);

        System.out.print(str);
        br.close();
    }
}
