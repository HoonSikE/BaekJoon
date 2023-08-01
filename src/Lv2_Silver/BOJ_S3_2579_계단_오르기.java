package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/2579
 */
public class BOJ_S3_2579_계단_오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 계단의 개수
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        for (int n = 1; n <= N; n++){
            arr[n] = Integer.parseInt(br.readLine());
        }

        // 1, 2번 째 초깃값
        dp[1] = arr[1];
        if(N >= 2){
            dp[2] = arr[1] + arr[2];
        }

        // 2칸 건너띄는 경우 vs 2칸 건너띄고 1칸 간 경우 + 현재 위치
        // 즉, 3번 연속 오르는 경우를 방지한다.
        for(int n = 3; n <= N; n++){
            dp[n] = Math.max(dp[n-2], dp[n-3] + arr[n-1]) + arr[n];
        }

        str.append(dp[N]);

        System.out.print(str);
        br.close();
    }
}
