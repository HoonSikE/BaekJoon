package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍, 배낭 문제
 * https://www.acmicpc.net/problem/2629
 */
public class BOJ_G3_2629_양팔저울 {
	static int N;
	static int[] A;
	// 2차원 배열:같은 무게의 추가 여러개가 있을 수 있기 때문에 중복되는 경우의 수를 제외해주기 위해서 생성
	static boolean[][] result;
	public static void backtracking(int cnt, int sum) {
		// 추로 만들 수 있는 무게 500*30 이상 || 이미 확인한 경우
		if(sum > 500*30 || result[cnt][sum]) return;
		result[cnt][sum] = true;
		if(cnt == N) 
			return;
		// 구슬 반대편에 추 1개 추가
		backtracking(cnt+1, sum + A[cnt]);
		// 현재 추 그대로
		backtracking(cnt+1, sum);
		// 구슬 쪽에 추 1개 추가
		backtracking(cnt+1, Math.abs(sum - A[cnt]));
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;
		// 추의 개수
		N = Integer.parseInt(br.readLine());
		// N개의 추
		A = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		// 판별가능한 무게
		result = new boolean[N+1][40001];
		// 추로 판별 할 수있는 무게의 모든 경우의수
		backtracking(0, 0);
		// 구슬의 개수
		int T = Integer.parseInt(br.readLine());
		// T개의 구슬
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < T; i++) {
			int t = Integer.parseInt(st.nextToken());
			// 무게확인 여부 출력
			if(result[N][t])
				str.append("Y ");
			else
				str.append("N ");
		}
		System.out.println(str);
	}
}
