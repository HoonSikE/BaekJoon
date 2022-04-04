package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2669
 */
public class BOJ_B1_2669_직사각형_네개의_합집합의_면적_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 100x100 크기의 map
		int[][] map = new int [100][100];
		// 결과 초기값
		int result = 0;
		// 4줄에 걸쳐서 사각형의 x1 y1 x2 y2 를 입력한다.
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			// 직사각형이 차지하는 면적에 1 저장
			for (int y = y1; y < y2; y++) {
				for (int x = x1; x < x2; x++) {
					map[y][x] = 1;
				}
			}
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				// 직사각형이 있다면 result값 증가
				if(map[i][j] == 1)
					result++;
			}
		}
		System.out.println(result);
		br.close();
	}
}
