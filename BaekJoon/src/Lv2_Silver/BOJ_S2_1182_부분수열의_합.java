package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘, 백트래킹
 * https://www.acmicpc.net/problem/1182
 */
public class BOJ_S2_1182_부분수열의_합 {
	static int N, S, result = 0;
	public static void combination(int[] arr, int num, int count, int start, int sum) {
		// 합한 값이 S가 되는 경우 +1
		if(count == num) {
			if(sum == S)
				result++;
			return;
		}
		// 중복을 허용하지 않는 조합
		for (int i = start; i < N; i++) {
			combination(arr, num, count+1, i+1, sum+arr[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 정수로 이루어 진 수
		N = Integer.parseInt(st.nextToken());
		// 원소를 다 더한 값이 S가 되는 경우의 수
		S = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		// N개의 원소값 입력
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 1개 ~ N개를 뽑는 모든 경우의수 확인
		for (int i = 1; i <= N; i++) {
			combination(arr, i, 0, 0, 0);
		}
		System.out.println(result);
		br.close();
	}
}
