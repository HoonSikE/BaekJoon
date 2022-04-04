package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍, 누적 합
 * https://www.acmicpc.net/problem/2616
 */
public class BOJ_G4_2616_소형기관차 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 객차의 수
		int N = Integer.parseInt(br.readLine());
		// 객차 손님의 누적합
		int[] sum = new int[N+1];
		st = new StringTokenizer(br.readLine(), " ");
		// 누적합 계산
		for (int i = 1; i <= N; i++)
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		//----------------------------------------
		for (int is : sum) {
			System.out.print(is + "\t");
		}
		System.out.println();
		//----------------------------------------
		// 최대로 끌 수 있는 객차의 수
		int MAX = Integer.parseInt(br.readLine());
		int[][] dp = new int[4][N+1];
		
		// 소형 기관차 3대 운송
		for (int i = 1; i < 4; i++) {
			for (int j = i*MAX; j <= N; j++) {
				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j-MAX] + (sum[j] - sum[j-MAX]));
				//----------------------------------------
				System.out.println("i: " + i + "\tj: " + j);
				System.out.println(dp[i-1][j-MAX] + "\t" + (sum[j] - sum[j-MAX]));
				//----------------------------------------
			}
		}
			
		//----------------------------------------
		System.out.println();
		for (int[] is : dp) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		//----------------------------------------
		System.out.println(dp[3][N]);
		br.close();
	}
}