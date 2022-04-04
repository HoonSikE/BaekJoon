package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/1260
 */
class Node{
	
}
public class BOJ_S2_1260_DFS와_BFS {
	public static void dfs() {
		
	}
	public static void bfs() {
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N: 간선의 개수, V: 정점의 번호, M: 두 정점의 번호
		int N = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// 간선이 연결되는 두 정점의 번호
		for (int i = 0; i < V; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
		}
		System.out.println(str.toString());
		br.close();
	}
}
