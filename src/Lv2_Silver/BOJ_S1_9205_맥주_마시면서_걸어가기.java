package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색
 * https://www.acmicpc.net/problem/9205
 */
class Pos{
	int Y;
	int X;
	public Pos(int Y, int X) {
		this.Y = Y;
		this.X = X;
	}
}
public class BOJ_S1_9205_맥주_마시면서_걸어가기 {
	static int N;
	static ArrayList<Pos> list;
	public static void bfs() {
		Queue<Pos> queue = new LinkedList<Pos>();
		queue.offer();
		
		while(!queue.isEmpty()) {
			
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;

		int T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= T; testcase++) {
			N = Integer.parseInt(br.readLine());
			
			// 맥주 1박스 : 맥주 20개
			// 50미터에 1병씩
			st = new StringTokenizer(br.readLine(), " ");
			
			list = new ArrayList<Pos>();
			for (int i = 0; i < N+2; i++) {
				list.add(new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())))
			}

			str.append("happy").append("\n");
			str.append("sad").append("\n");
		}

		System.out.println(str.toString());
		br.close();
	}
}
