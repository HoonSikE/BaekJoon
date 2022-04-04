package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 누적 합, 두 포인터, 슬라이딩 윈도우
 * https://www.acmicpc.net/problem/2559
 */
public class BOJ_S3_2559_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N : 측정한 전체 날짜의 수
		int N = Integer.parseInt(st.nextToken());
		// K : 합을 구하기 위한 연속적인 날짜의 수
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N-K+1; i++) {
			int tmp = 0;
			for (int j = i; j < i+K; j++) {
				tmp += arr[j];
			}
			max = max < tmp ? tmp : max;
			System.out.println(tmp);
		}
		System.out.println(max);
		br.close();
	}
}
