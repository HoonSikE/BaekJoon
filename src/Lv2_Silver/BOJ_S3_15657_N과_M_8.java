package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 백트래킹
 * https://www.acmicpc.net/problem/15657
 */
public class BOJ_S3_15657_N과_M_8 {
	static int N, M, num[], result[];
	static StringBuilder str = new StringBuilder();
	public static void backtracking(int cnt, int start) {
		if(cnt == M) {
			for (int num : result)
				str.append(num + " ");
			str.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			result[cnt] = num[i];
			backtracking(cnt+1, i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 자연수
		N = Integer.parseInt(st.nextToken());
		num = new int[N];
		// M : 수열의 길이
		M = Integer.parseInt(st.nextToken());
		result = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			num[i] = Integer.parseInt(st.nextToken()); 
		
		Arrays.sort(num);
		
		backtracking(0, 0);
		
		System.out.println(str);
		br.close();
	}
}
