package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/1463
 */
public class BOJ_S3_1463_1로_만들기 {
	static int[] d;
	public static int dp(int n) {
		if(n==1) return 0;
		if(d[n] > 0) return d[n];
		
		d[n] = dp(n-1) + 1;
		
		if(n%2==0) {
			int tmp = dp(n/2) +1;
			if(d[n] > tmp) d[n] = tmp;
		}
		if(n%3 == 0) {
			int tmp = dp(n/3) +1;
			if(d[n] > tmp) d[n] = tmp;
		}
		
		return d[n];
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		d = new int[N+1];
		System.out.println(dp(N));
		br.close();
	}
}