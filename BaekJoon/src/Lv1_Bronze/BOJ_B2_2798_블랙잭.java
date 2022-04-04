package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2798
 */
public class BOJ_B2_2798_블랙잭 {
	static int N, M, result, card[];
	public static void backtracking(int cnt, int start, int sum) {
		if(cnt == 3) {
			if(sum <= M)
				result = result < sum ? sum : result;
			return;
		}
		for (int i = start; i < N; i++) {
			backtracking(cnt+1, i+1, sum+card[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 카드의 개수
		N = Integer.parseInt(st.nextToken());
		// 카드의 합 목표치
		M = Integer.parseInt(st.nextToken());
		// N개의 카드 숫자 입력
		card = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < card.length; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(card);
		result = 0;
		backtracking(0,0,0);
		System.out.println(result);
		br.close();
	}
}
