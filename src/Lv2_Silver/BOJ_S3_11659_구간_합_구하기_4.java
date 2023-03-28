package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 누적 합
 * https://www.acmicpc.net/problem/11659
 */
public class BOJ_S3_11659_구간_합_구하기_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 수의 개수
        int N = Integer.parseInt(st.nextToken());
        // M: 합을 구해야 하는 횟수
        int M = Integer.parseInt(st.nextToken());
        // 누적합
        int[] dp = new int[N+1];

        // N개의 수
        st = new StringTokenizer(br.readLine());
        for (int n = 1; n <= N; n++)
            dp[n] = dp[n-1] + Integer.parseInt(st.nextToken());

        // 합을 구해야하는 구간 (i번째~j번째까지의 합)
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            str.append(dp[j]-dp[i-1]).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
