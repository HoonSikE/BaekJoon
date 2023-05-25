package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/1260
 */
class Node{
	
}
public class BOJ_S2_1260_DFS와_BFS {
	static StringBuilder str = new StringBuilder();
	static Queue<Integer> queue = new LinkedList<>();
	static boolean[] check;
	static int node;
	public static void dfs(int start) {
		check[start] = true;
		str.append(start + " ");
	}
	public static void bfs(int start) {
		queue.add(start);
		check[start] = true;

		while(!queue.isEmpty()){
			start = queue.poll();
			str.append(start + " ");

			for(int n = 1; n <= node; n++){
				
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N: 정점의 개수, M: 간선의 개수, V: 탐색을 시작할 정점의 번호
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		// 간선이 연결하는 두 정점의 번호
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			
		}
		System.out.println(str.toString());
		br.close();
	}
}
