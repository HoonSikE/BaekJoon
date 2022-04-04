package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 백트래킹
 * https://www.acmicpc.net/problem/15652
 */
public class BOJ_S3_15652_N과_M_4 {
	static int N, M, result[];
	static StringBuilder str = new StringBuilder();
	public static void backtracking(int cnt, int start) {
		if(cnt == M) {
			for (int num : result)
				str.append(num + " ");
			str.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			result[cnt] = i+1;
			backtracking(cnt+1, i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 자연수
		N = Integer.parseInt(st.nextToken());
		// M : 수열의 길이
		M = Integer.parseInt(st.nextToken());
		result = new int[M];
		
		backtracking(0, 0);
		
		System.out.println(str);
		br.close();
	}
}