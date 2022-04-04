package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘, 백트래킹
 * https://www.acmicpc.net/problem/10819
 */
public class BOJ_S2_10819_차이를_최대로 {
	static int N, result;
	static int[] arr;
	static int[] new_arr;
	static boolean[] isSelect;
	public static void backtracking(int count) {
		if(count == N) {
			int max = 0;
			for (int i = 0; i < N-1; i++) {
				max += Math.abs(new_arr[i] - new_arr[i+1]);
			}
			result = Math.max(max, result);
			return;
		}
		for (int i = 0; i < N; i++) {
			if(!isSelect[i]) {
				isSelect[i] = true;
				new_arr[count] = arr[i];
				backtracking(count+1);
				isSelect[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 배열의 수
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N];
		new_arr = new int[N];
		isSelect = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		backtracking(0);
		System.out.println(result);
		br.close();
	}
}
