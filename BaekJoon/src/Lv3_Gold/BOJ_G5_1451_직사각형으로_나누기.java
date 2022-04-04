package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘, 누적 합, 많은 조건 분기
 * https://www.acmicpc.net/problem/1451
 */
public class BOJ_G5_1451_직사각형으로_나누기 {
	static long result = Long.MIN_VALUE;
	public static int sumRang(int Row_start, int Row_end, int Col_start, int Col_end, int[][] num) {
		int sum = 0;
		for (int i = Row_start; i < Row_end; i++)
			for (int j = Col_start; j < Col_end; j++)
				sum += num[i][j];
		return sum;
	}
	public static void Row(long multi, int row_start, int N, int col_start, int M, int[][] num) {
		for (int i = row_start+1; i < N; i++) {
			long tmp = multi;
			tmp *= sumRang(row_start, i, col_start, M, num);
			tmp *= sumRang(i, N, col_start, M, num);
			result = Math.max(result, tmp);
		}
	}
	public static void Col(int multi, int row_start, int N, int col_start, int M, int[][] num) {
		for (int i = col_start+1; i < M; i++) {
			long tmp = multi;
			tmp *= sumRang(row_start, N, col_start, i, num);
			tmp *= sumRang(row_start, N, i, M, num);
			result = Math.max(result, tmp);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// NxM 크기의 직사각형
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// 직사각형의 데이터 입력
		int[][] num = new int[N][M];
		for (int i = 0; i < N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for (int j = 0; j < M; j++)
				num[i][j] = Integer.parseInt(tmp[j] + "");
		}
		for (int i = 1; i < N; i++) {
			int sum = sumRang(0, i, 0, M, num);
			// 세로 + 세로 + 세로
			Col(sum, i, N, 0, M, num);
			// 세로 + 가로 + 가로
			Row(sum, i, N, 0, M, num);
		}
		for (int i = N-1; i > 0; i--) {
			int sum = sumRang(i, N, 0, M, num);
			// 역방향 세로 + 가로 + 가로
			Col(sum, 0, i, 0, M, num);
		}
		for (int i = 1; i < M; i++) {
			int sum = sumRang(0, N, 0, i, num);
			// 가로 + 가로 + 가로
			Row(sum, 0, N, i, M, num);
			// 가로 + 세로 + 세로
			Col(sum, 0, N, i, M, num);
		}
		for (int i = M-1; i > 0; i--) {
			int sum = sumRang(0, N, i, M, num);
			// 역방향 가로 + 세로 + 세로
			Row(sum, 0, N, 0, i, num);
		}
		System.out.println(result);
		br.close();
	}
}
