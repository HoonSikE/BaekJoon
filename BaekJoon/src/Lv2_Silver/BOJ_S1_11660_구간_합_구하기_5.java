package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍, 누적 합
 * https://www.acmicpc.net/problem/11660
 */
public class BOJ_S1_11660_구간_합_구하기_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N: 표의 크
		int N = Integer.parseInt(st.nextToken());
		// M: 합을 구해야하는 횟수
		int M = Integer.parseInt(st.nextToken());
		// NxN 크기의 표
		int[][] arr = new int[N+1][N+1];
		int[][] sum = new int[N+1][N+1];
		// 표의 값을 받아옴과 동시에 누적합을 구함
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				// 좌 누적합 + 상 누적합 - 좌상 누적합 + 현재값
				sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i][j];
			}
		}
		// 합을 구함
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// index값으로 사용하기 위해 1씩 감소
			// x, y로 보지말고 row, col로 생각하면 편함.......
			int x1 = Integer.parseInt(st.nextToken()); 
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			// 1칸만 구할때
			str.append(sum[x2][y2]-(sum[x2][y1-1]+sum[x1-1][y2]-sum[x1-1][y1-1])).append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
