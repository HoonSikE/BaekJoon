package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘, 백트래킹, 외판원 순회문제
 * https://www.acmicpc.net/problem/10971
 */
public class BOJ_S2_10971_외판원_순회_2 {
	static int result = Integer.MAX_VALUE;
	public static void backtracking(int count, int start, int pre, int cost, int N, int[][] map, boolean[] visited) {
		// 처음부터 next만 true로 해줬기 때문에 돌아오는 경우 따로 계산 불필요
		// N개의 도시를 다 돌고 처음 도시로 돌아 가는 경우
		if(count == N && start == pre) {
			// 최소비용 산출
			result = Math.min(result, cost);
			return;
		}
		for (int next = 0; next < N; next++) {
			// 이미 방문했거나 갈 수 없다면 continue;
			if(visited[next] || map[pre][next] == 0) continue;
			// 마지막 방문지에서 갈수 있다면
			visited[next] = true;
			cost += map[pre][next];
			backtracking(count+1, start, next, cost, N, map, visited);
			visited[next] = false;
			cost -= map[pre][next];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 도시의 수
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		boolean[] visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			backtracking(0, i, i, 0, N, map, visited);
		}
		System.out.println(result);

		br.close();
	}
}
