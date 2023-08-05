package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/11726
 */
public class BOJ_S3_11726_2xn_타일링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int n = 3; n <= N; n++){
            dp[n] = (dp[n-2] + dp[n-1]) % 10007;
        }

        str.append(dp[N]);

        System.out.print(str);
        br.close();
    }
}
