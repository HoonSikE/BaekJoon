package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S3_9095_123_더하기_DP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 테스트 케이스 개수 T
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[10];
		dp[0] = 1;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 4; j++) {
				if(i-j < 0)
					break;
				dp[i] += dp[i-j];
			}
		}
		while(T-->0) {
			str.append(dp[Integer.parseInt(br.readLine())-1]).append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
