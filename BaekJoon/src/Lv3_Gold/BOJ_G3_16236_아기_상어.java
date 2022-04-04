package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Index {
	int y;
	int x;
	public Index(int i, int j) {
		this.y = i;
		this.x = j;
	}
}
public class BOJ_G3_16236_아기_상어 {
	static int N, map[][];
	static boolean[][] isVisited;
	// 좌, 상, 우, 하
	static int[] dRow = { 0,-1, 0, 1};
	static int[] dCol = {-1, 0, 1, 0};
	public static void bfs(int start_Row, int start_Col, int size_cnt, int size) {
		Queue<Index> queue = new LinkedList<Index>();
		int count = 0;
		
		queue.offer(new Index(start_Row, start_Col));
		
		while(!queue.isEmpty()) {
			Index current = queue.poll();
			// 좌, 상, 우, 하
			for (int i = 0; i < 4; i++) {
				int next_Row = current.y+dRow[i];
				int next_Col = current.x+dCol[i];
				// 범위를 벗어나거나 size를 초과하면 continue;
				if(next_Row < 0 || next_Row >= N || next_Col < 0 || next_Col >= N)
					continue;
				if(map[next_Row][next_Col] > size || isVisited[next_Row][next_Col])
					continue;
				else if(map[next_Row][next_Col] < size) {
					map[next_Row][next_Col] = 0;
					if(++size_cnt == size) {
						size_cnt = 0;
						size++;
					}
				}
				queue.offer(new Index(next_Row, start_Col));
				isVisited[current.y][current.x] = true;
				isVisited[next_Row][next_Col] = true;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		// N : 공간의 크기
		N = Integer.parseInt(br.readLine());
		// NxN 크기의 map
		map = new int[N][N];
		isVisited = new boolean[N][N];
		// 0: 빈 칸
		// 1, 2, 3, 4, 5, 6: 칸에 있는 물고기의 크기
		// 9: 아기 상어의 위치
		int start_row = 0;
		int start_col = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 9) {
					map[i][j] = 0;
					start_row = i;
					start_col = j;
				}
			}
		}
		bfs(start_row, start_col, 0, 2);
		
		br.close();
	}
}
