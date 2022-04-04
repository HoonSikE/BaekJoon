package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 백트래킹
 * https://www.acmicpc.net/problem/15665
 */
public class BOJ_S2_15665_N과_M_11 {
	static int num[], result[];
	/*
	 * 앞의 문제들은 LinkedHashSet를 사용해서 중복을 제거했었지만
	 * 이번 번제는 그렇게 할 경우 시간초과가 떴다. 따라서, 다른 방법을 적용했다.
	 */
	static StringBuilder str = new StringBuilder();
	public static void backtracking(int cnt, int N, int M) {
		if(cnt == M) {
			for (int num : result)
				str.append(num + " ");
			str.append("\n");
			return;
		}
		int n = 0;
		for (int i = 0; i < N; i++) {
			// 중복된 값이라면 continue (같은 cnt에서 같은 값은 뽑지 않도록)
			if(n == num[i]) continue;
			result[cnt] = num[i];
			backtracking(cnt+1, N, M);
			n = num[i];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 자연수
		int N = Integer.parseInt(st.nextToken());
		num = new int[N];
		// M : 수열의 길이
		int M = Integer.parseInt(st.nextToken());
		result = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			num[i] = Integer.parseInt(st.nextToken()); 
		
		Arrays.sort(num);
		
		backtracking(0, N, M);
		System.out.println(str);
		br.close();
	}
}
