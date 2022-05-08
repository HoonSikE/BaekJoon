package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/1003
 */
class Number{
	int zero = 0;
	int one = 0;
	public Number(int zero, int one) {
		this.zero = zero;
		this.one = one;
	}
	@Override
	public String toString() {
		return zero + " " + one;
	}
}
public class BOJ_S3_1003_피보나치_함수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// DP 배열 선언
		Number[] dp = new Number[50];
		// 초기값
		dp[0] = new Number(1,0);
		dp[1] = new Number(0,1);
		// T개의 테스트 케이스
		int T = Integer.parseInt(br.readLine());
		int index = 1;
		for (int t = 0; t < T; t++) {
			int num = Integer.parseInt(br.readLine());
			if(num <= index)
				str.append(dp[num]).append("\n");
			else {
				for (int i = index+1; i <= num; i++, index++)
					dp[i] = new Number(dp[i-1].zero + dp[i-2].zero, dp[i-1].one + dp[i-2].one);
				str.append(dp[num]).append("\n");
			}
		}
		System.out.println(str);
		br.close();
	}
}