package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 시뮬레이션, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2636
 */
public 
public class BOJ_G4_2636_치즈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int Row = Integer.parseInt(st.nextToken());
		int Col = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[Row][Col];
		
		for (int i = 0; i < Row; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < Col; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				// 구멍부분 미리 계산
				if((i==0 || i==Row-1 || j==0 || j==Col-1)&& map[i][j] == 1) {
					map[i][j] = 0;
				}
			}
		}

		int time = 0;
		int num = 0;
		
		System.out.println(time);
		System.out.println(num);
		br.close();
	}
}
