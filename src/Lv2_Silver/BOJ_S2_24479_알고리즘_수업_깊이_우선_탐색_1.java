package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 정령, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/24479
 */
public class BOJ_S2_24479_알고리즘_수업_깊이_우선_탐색_1 {
    static StringBuilder str = new StringBuilder();
    static int cnt;
    static int[] check;
    static ArrayList<ArrayList<Integer>> graph;
    // V : 정점 집합, E : 간선 집합, R : 시작 정점
    public static void dfs(int vertex){
        check[vertex] = cnt;

        for(int i = 0; i < graph.get(vertex).size(); i++){
            int newVertex = graph.get(vertex).get(i);

            if(check[newVertex] == 0){
                cnt++;
                dfs(newVertex);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 정점의 수, M: 간선의 수, R: 시작 정점
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        check = new int[N+1];

        for(int i = 0; i < N+1; i++)
            graph.add(new ArrayList<>());

        for (int m = 0; m < M; m++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 양방향(무방향) 정보 추가
            graph.get(i).add(j);
            graph.get(j).add(i);
        }

        for(ArrayList<Integer> list: graph)
            Collections.sort(list);

        cnt = 1;

        dfs(R);

        for(int i = 1; i < check.length; i++)
            str.append(check[i]).append("\n");

        System.out.print(str);
        br.close();
    }
}
