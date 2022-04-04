package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍, 브루트포스 알고리즘, 배낭문제
 * https://www.acmicpc.net/problem/1535
 */
public class BOJ_S2_1535_안녕 {
	static int result = 0;
	public static void backtracking(int visitCnt, int cnt, int start, int life, int happy, int N, int[] L, int[] J) {
		// 방문한 사람 == visitCnt 일때
		if(cnt == visitCnt) {
			// 살아있다면
			if(life > 0)
				// 행복 최대값 최신화
				result = Math.max(result, happy);
			return;
		}
		for (int i = start; i < N; i++) {
			life -= L[i];
			happy += J[i];
			backtracking(visitCnt, cnt+1, i+1, life, happy, N, L, J);
			life += L[i];
			happy -= J[i];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 사람의 수
		int N = Integer.parseInt(br.readLine());
		// 잃는 체력
		int[] L = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			L[i] = Integer.parseInt(st.nextToken());
		// 얻는 기쁨
		int[] J = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			J[i] = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= N; i++)
			backtracking(i, 0, 0, 100, 0, N, L, J);
		
		System.out.println(result);
		br.close();
	}
}
