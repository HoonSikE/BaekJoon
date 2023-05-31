package Lv2_Silver;

import java.io.*;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/1463
 */
public class BOJ_S3_1463_1로_만들기 {
	/**
	 * 시간 비교
	 * 1. 재귀 O, Math O: 시간 초과
	 * 2. 재귀 O, Math X: 236ms
	 * 3. 재귀 X, Math O: 104mx
	 * 4. 재귀 X, Math X: 104ms
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 연산 횟수 저장
		int[] dp = new int[N+1];

		dp[0] = dp[1] = 0;

		for(int i = 2; i <= N; i++){
			dp[i] = dp[i-1] + 1;

			// 2번 연산
			if(i%2==0)
				dp[i] = Math.min(dp[i], dp[i/2]+1);

			// 1번 연산
			if(i%3 == 0)
				dp[i] = Math.min(dp[i], dp[i/3]+1);
		}

		System.out.println(dp[N]);
		br.close();
	}
}