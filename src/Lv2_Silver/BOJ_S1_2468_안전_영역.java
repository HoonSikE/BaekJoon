package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2468
 */
public class BOJ_S1_2468_안전_영역 {
    // 모든 높이가 같다면 최대의 경우는 1이다.
    static int result = 1;
    static int N;
    static int[][] arr;
    static boolean[][] isVisited;
    static int height = 1;
    // 상하좌우
    static int[] dCol = { 1,-1, 0, 0};
    static int[] dRow = { 0, 0,-1, 1};

    public void dfs(int y, int x){


        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nextCol = y + dCol[i];
            int nextRow = x + dRow[i];

            // 범위를 벗어나거나 이미 침수상태라면 continue;
            if(nextCol < 0 || nextCol >= N || nextRow < 0 || nextRow >= N || arr[nextCol][nextRow] < height){
                continue;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // N x N의 배열
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        int maxHeight = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                // 최고 높이 갱신
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }


        for (height = 1; height <= maxHeight; height++) {
            // 물의 높이가 1일때 부터 최대높이(maxHeight)일 때까지
            // 방문 초기화
            isVisited = new boolean[N][N];
            // dfs
        }

        System.out.println(result);

        br.close();
    }     
}
