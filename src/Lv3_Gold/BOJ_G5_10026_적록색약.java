package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색(BFS), 깊이 우선 탐색(DFS)
 * https://www.acmicpc.net/problem/10026
 */
class Pair{
	int y;
	int x;
	public Pair(int y, int x) {
		this.y = y;
		this.x = x;
	}
}
public class BOJ_G5_10026_적록색약 {
	static int N;
	static char[][] map;
	static boolean[][] isVisited;
	
	public static void bfs(Pair start) {
		Queue<Pair> queue = new LinkedList<Pair>();
		// 상하좌우
		int[] dRow = {-1, 1, 0, 0};
		int[] dCol = { 0, 0,-1, 1};
		// 범위 탐색 색깔 지정
		char color = map[start.y][start.x];
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			Pair current = queue.poll();
			// 4방 탐색
			for (int i = 0; i < 4; i++) {
				int now_Row = current.y + dRow[i];  
				int now_Col = current.x + dCol[i];
				// 범위 내에 없다면
				if(now_Row < 0 || N <= now_Row || now_Col < 0 || N <= now_Col)
					continue;
				// 이미 탐색을 했거나, 색깔이 다르다면
				if(isVisited[now_Row][now_Col] || map[now_Row][now_Col] !=color)
					continue;
				queue.offer(new Pair(now_Row, now_Col));
				isVisited[now_Row][now_Col] = true;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N : 그림 크기
		N = Integer.parseInt(br.readLine());
		// NxN 크기의 그림
		map = new char[N][N];
		isVisited = new boolean[N][N];
		
		for (int i = 0; i < N; i++)
			map[i] = br.readLine().toCharArray();
		
		// 적록색맹이 없는 경우
		// bfs 진행
		int cnt1 = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(!isVisited[i][j]) {
					bfs(new Pair(i, j));
					cnt1++;
				}
			}
		}
		// 적록 색맹인 경우
		int cnt2 = 0;
		isVisited = new boolean[N][N];
		// R과 G를 구분하지 못하므로 같은 값으로 통일시켜 줌.
		for (int i = 0; i < map.length; i++)
			for (int j = 0; j < map[i].length; j++)
				if(map[i][j] == 'G')
					map[i][j] = 'R';
		// bfs 진행
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(!isVisited[i][j]) {
					bfs(new Pair(i, j));
					cnt2++;
				}
			}
		}
		System.out.println(cnt1 + " " + cnt2);
		br.close();
	}
}