package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 그래프 이론, 그리디 알고리즘, 그리프 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/3109
 */
public class BOJ_G2_3109_빵집 {
	// 우상, 우, 우하
	static int[] dRow = {-1, 0, 1};
	static int[] dCol = { 1, 1, 1};
	public static boolean pipeLine(int Row, int Col, int R, int C, char[][] map) {
		// 마지막으로 간 곳이 빵집이라면 방문 확인 및 count++
		if(Col == C-1)
			return true;
		for (int index = 0; index < 3; index++) {
			int next_Row = Row + dRow[index];
			int next_Col = Col + dCol[index];
			// 범위 밖에 있거나 이미 선택 되었다면 continue; Col의 경우 굳이 안봐도 됨.
			if(next_Row < 0 || next_Row >= R || map[next_Row][next_Col] != '.') continue;
				// 이쪽 방향으로 진행할때만 실시하므로 다른 제귀에 영향을 끼치지는 않는다
			map[next_Row][next_Col] = 'x';
				// 제귀 호출 시 방문이 완료되었다면 더이상 진행하지 않음
			if (pipeLine(next_Row, next_Col, R, C, map))
				return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// RxC의 map
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char[][] map = new char[R][C];
		// map data 입력
		for (int i = 0; i < R; i++)
			map[i] = br.readLine().toCharArray();
		int count = 0;
		for (int i = 0; i < R; i++)
			// 가스관의 위치 초기값으로 진행하고 파이프 연결이 가능하다면 count++;
			if(pipeLine(i, 0, R, C, map))
				count++;
		str.append(count).append("\n");
		System.out.println(str.toString());
		br.close();
	}
}
