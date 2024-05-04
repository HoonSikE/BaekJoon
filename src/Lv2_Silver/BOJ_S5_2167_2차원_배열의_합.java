package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 누적합
 * https://www.acmicpc.net/problem/2167
 */
public class BOJ_S5_2167_2차원_배열의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] dp = new int[N+1][M+1];

        for (int n = 1; n <= N; n++){
            st = new StringTokenizer(br.readLine());
            for (int m = 1; m <= M; m++){
                dp[n][m] = dp[n][m-1] + dp[n-1][m] - dp[n-1][m-1] + Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());

        for (int k = 0; k < K; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            str.append(dp[x][y] - dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1]).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
