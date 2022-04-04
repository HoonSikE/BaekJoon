package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2567
 */
public class BOJ_S4_2567_색종이_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 100x100 크기의 도화지
		boolean[][] paper = new boolean[101][101];
		// 색종이의 수
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			// 크기가 10인 색종이
			for (int n = y; n < y+10; n++) {
				for (int m = x; m < x+10; m++) {
					paper[n][m] = true;
				}
			}
		}
		// 상하좌우
		int result = 0;
		int[] dRow = {-1, 1, 0, 0};
		int[] dCol = { 0, 0,-1, 1};
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				// 색종이가 포함된 범위에 한해서
				if(paper[i][j] == true) {
					// 상하좌우
					for (int index = 0; index < 4; index++) {
						int next_Row = i + dRow[index];
						int next_Col = j + dCol[index];
						if(paper[next_Row][next_Col] == false)
							result++;
						// 범위 밖으로 나가는 경우도 result++;
						else if(next_Row < 0 || next_Row >= 100 || next_Col < 0 || next_Col >= 100)
							result++;
					}
				}
			}
		}
		System.out.println(result);
		br.close();
	}
}