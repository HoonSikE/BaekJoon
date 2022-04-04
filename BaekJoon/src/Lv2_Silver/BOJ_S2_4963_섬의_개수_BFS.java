package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair{
	int y;
	int x;
	public Pair(int y, int x) {
		this.y = y;
		this.x = x;
	}
}
public class BOJ_S2_4963_섬의_개수_BFS {
	static int W, H, map[][];
	static boolean[][] isVisited;
	// 좌상, 좌, 좌하, 하, 우하, 우, 우상, 상
	static int[] dRow = {-1, 0, 1, 1, 1, 0,-1,-1};
	static int[] dCol = {-1,-1,-1, 0, 1, 1, 1, 0};
	
	static void bfs(Pair start) {
		Queue<Pair> queue = new LinkedList<>();
		queue.add(start);
		while(!queue.isEmpty()) {
			Pair pair = queue.poll();
//			isVisited[pair.y][pair.x] = true;	// 여기서 해주면 메모리 초과 발생
			// 8방 탐색
			for (int i = 0; i < 8; i++) {
				// 좌상, 좌, 좌하, 하, 우하, 우, 우상, 상
				int next_Row = pair.y + dRow[i];
				int next_Col = pair.x + dCol[i];
				// 범위내에 있다면
				if(next_Row < 0 || next_Row >= H || next_Col < 0 || next_Col >= W)
					continue;
				// 인접한 섬들이 없거나 || 방문했을 때
				if(map[next_Row][next_Col] == 0 || isVisited[next_Row][next_Col])
					continue;
				queue.add(new Pair(next_Row, next_Col));
				// 여키서 체크해줘야 중복 방지로 메모리 초과 x
				isVisited[pair.y][pair.x] = true;
				isVisited[next_Row][next_Col] = true;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;

		while(true) {
			// 첫줄은 W, H값을 받아옴
			st = new StringTokenizer(br.readLine(), " ");
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			// 끝값이 0 0이면  while문 정지
			if(W == 0 && H ==0) break;
			// WxH 크기의 map 생성, visited 생성
			map = new int[H][W];
			isVisited = new boolean[H][W];
			int count = 0;
			
			// map의 값을 받아옴
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < W; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			// 방문하지 않은 && 섬인경우 bfs 실행 후 cnt++
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(!isVisited[i][j] && map[i][j] == 1) {
						bfs(new Pair(i, j));
						count++;
					}
				}
			}
			// 섬의 개수 cnt 출력
			str.append(count).append("\n");
		}
		System.out.print(str);
		br.close();
	}
}
