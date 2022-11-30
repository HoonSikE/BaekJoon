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
    static int answer = 0;
    static int result = 0;
    static int N;
    static int[][] arr;
    static boolean[][] isVisited;
    static int height = 0;
    // 상하좌우
    static int[] dCol = { 1,-1, 0, 0};
    static int[] dRow = { 0, 0,-1, 1};

    public static void dfs(int y, int x){
        // 방문 표시
        isVisited[y][x] = true;

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nextCol = y + dCol[i];
            int nextRow = x + dRow[i];

            // 범위를 벗어나면 continue
            if(nextCol < 0 || nextCol >= N || nextRow < 0 || nextRow >= N)
                continue;
            // 침수되지 않았고 방문하지 않았다면 탐색 실시
            if(arr[nextCol][nextRow] > height && !isVisited[nextCol][nextRow])
                dfs(nextCol, nextRow);
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

        // 물의 높이가 1일때 부터 최대높이(maxHeight)일 때까지
        for (height = 0; height <= maxHeight; height++) {
            // 방문 초기화
            isVisited = new boolean[N][N];
            answer = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 침수되지 않았고 방문하지 않았다면 탐색 실시
                    if(arr[i][j] > height && !isVisited[i][j]){
                        dfs(i,j);
                        // 탐색이 끝났다면 이게 1개의 영역이다.
                        answer++;
                    }
                }
            }
            result = Math.max(result, answer);
        }

        System.out.println(result);

        br.close();
    }     
}
