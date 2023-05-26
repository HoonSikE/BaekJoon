package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/1260
 */
public class BOJ_S2_1260_DFS와_BFS {
	static StringBuilder str = new StringBuilder();
	static boolean[] check;
	static int[][] arr;
	static int N, M, V;
	static Queue<Integer> queue = new LinkedList<>();
	public static void dfs(int num) {
		check[num] = true;
		str.append(num + " ");

		for(int n = 0; n <= N; n++)
			if(arr[num][n] == 1 && !check[n])
				dfs(n);
	}
	public static void bfs(int num) {
		queue.add(num);
		check[num] = true;

		while(!queue.isEmpty()){
			num = queue.poll();
			str.append(num + " ");

			for(int n = 1; n <= N; n++){
				if(arr[num][n] == 1 && !check[n]){
					queue.add(n);
					check[n] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// N: 정점의 개수, M: 간선의 개수, V: 탐색을 시작할 정점의 번호
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		arr = new int[N+1][N+1];
		check = new boolean[N+1];

		// 간선이 연결하는 두 정점의 번호
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arr[x][y] = arr[y][x] = 1;
		}

		dfs(V);
		str.append("\n");

		check = new boolean[N+1];
		bfs(V);

		System.out.println(str.toString());
		br.close();
	}
}
