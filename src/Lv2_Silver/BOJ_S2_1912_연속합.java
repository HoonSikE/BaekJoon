package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/1912
 */
public class BOJ_S2_1912_연속합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] dp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            arr[n] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int answer = arr[0];

        for(int n = 1; n < N; n++){
            dp[n] = Math.max(dp[n-1] + arr[n], arr[n]);

            answer = Math.max(answer, dp[n]);
        }

        str.append(answer);

        System.out.print(str);
        br.close();
    }
}
