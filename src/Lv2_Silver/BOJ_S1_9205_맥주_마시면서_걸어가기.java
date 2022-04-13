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
	public static boolean bfs() {
		Queue<Pos> queue = new LinkedList<Pos>();
		boolean[] isVisited = new boolean[N+1];
		queue.offer(list.get(0));
		Pos End = list.get(list.size()-1);
		
		while(!queue.isEmpty()) {
			Pos nowPos = queue.poll();
			// 편의점을 들리지 않고 바로 도착지로 갈 수 있는 경우
			if(Math.abs(End.X - nowPos.X) + Math.abs(End.Y - nowPos.Y) <= 1000)
				return true;
			
			for (int i = 1; i <= N; i++) {
				if(!isVisited[i]) {
					Pos nextPos = list.get(i);
					// 현재 갈 수 있는 편의점으로 이동
					if(Math.abs(nextPos.Y - nowPos.Y) + Math.abs(nextPos.X - nowPos.X) <= 1000) {
						isVisited[i] = true;
						queue.add(new Pos(nextPos.Y, nextPos.X));
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;

		int T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= T; testcase++) {
			N = Integer.parseInt(br.readLine());
			// 맥주 1박스 : 맥주 20개, 50미터에 1병씩
			list = new ArrayList<Pos>();
			for (int i = 0; i < N+2; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				list.add(new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}
			str.append(bfs()? "happy" : "sad").append("\n");
		}
		System.out.print(str.toString());
		br.close();
	}
}
