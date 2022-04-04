package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 누적 합
 * https://www.acmicpc.net/problem/11441
 */
public class BOJ_S3_11441_합_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;
		// 첫쨰 줄에 수의 개수
		int N = Integer.parseInt(br.readLine());
		// A1~AN
		int[] A = new int[N+1];
		A[0] = 0;
		st = new StringTokenizer(br.readLine(), " ");
		// 누적합 계산
		for (int i = 1; i < N+1; i++)
			A[i] = A[i-1] + Integer.parseInt(st.nextToken());
		// 구간의 개수
		int M = Integer.parseInt(br.readLine());
		// M개의 줄에 입력된 각 구간
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			// 구간 합 출력
			str.append(A[j]-A[i-1]).append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
