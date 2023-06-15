package Lv3_Gold;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/2293
 */
public class BOJ_G5_2293_동전_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] dp = new int[K+1];
        int[] coin = new int[N];

        for (int n = 0; n < N; n++)
            coin[n] = Integer.parseInt(br.readLine());

        Arrays.sort(coin);
        dp[0] = 1;

        for(int n = 0; n < N; n++){
            for(int k = 1; k <= K; k++){
                if(k >= coin[n])
                    dp[k] += dp[k - coin[n]];
            }
        }

        str.append(dp[K]);

        System.out.print(str);
        br.close();
    }
}
