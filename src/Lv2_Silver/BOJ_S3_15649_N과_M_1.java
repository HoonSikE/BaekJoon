package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 백트래킹
 * https://www.acmicpc.net/problem/15649
 */
public class BOJ_S3_15649_N과_M_1 {
	static int N, M, result[];
	static boolean[] visited;
	static StringBuilder str = new StringBuilder();
	public static void backtracking(int cnt) {
		if(cnt == M) {
			for (int num : result)
				str.append(num + " ");
			str.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if(visited[i])	continue;
			result[cnt] = i+1;
			visited[i] = true;
			backtracking(cnt+1);
			visited[i] = false;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 자연수
		N = Integer.parseInt(st.nextToken());
		visited = new boolean[N];
		// M : 수열의 길이
		M = Integer.parseInt(st.nextToken());
		result = new int[M];
		
		backtracking(0);
		
		System.out.println(str);
		br.close();
	}
}
