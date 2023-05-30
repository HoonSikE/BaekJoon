package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 정령, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/24479
 */
public class BOJ_S2_24479_알고리즘_수업_깊이_우선_탐색_1 {
    static boolean[][] arr;
    static boolean[] isVisited;
    // V : 정점 집합, E : 간선 집합, R : 시작 정점
    public static void dfs(){

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 정점의 수, M: 간선의 수, R: 시작 정점
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        arr = new boolean[N][N];
        isVisited = new boolean[N];

        for (int m = 0; m < M; m++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            arr[i][j] = arr[j][i] = true;
        }
        System.out.print(str);
        br.close();
    }
}
