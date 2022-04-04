package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10163
 */
public class BOJ_B1_10163_색종이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 1001x1001 크기의 흰색 도화지
		int[][] map = new int[1001][1001];
		
		// 색종이의 개수
		int N = Integer.parseInt(br.readLine());
		
		// 10x10 크기의 색종이 입력 
		for (int n = 1; n <= N; n++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int X1 = Integer.parseInt(st.nextToken());
			int Y1 = Integer.parseInt(st.nextToken());
			int X2 = Integer.parseInt(st.nextToken());
			int Y2 = Integer.parseInt(st.nextToken());
			
			// 색종이 얹는 부분을 해당 번호로 표시
			for (int y = Y1; y < Y1+Y2; y++) {
				for (int x = X1; x < X1+X2; x++) {
					map[y][x] = n;
				}
			}
		}
		// 각 종이별 보이는 범위 계산
		for (int n = 1; n <= N; n++) {
			int count = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j] == n)
						count++;
				}
			}
			System.out.println(count);
		}
		br.close();
	}
}
