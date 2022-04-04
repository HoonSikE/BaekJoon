package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2563
 */
public class BOJ_B1_2563_색종이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		// 색종이의 수
		int T = Integer.parseInt(br.readLine());
		// 100x100 크기의 흰색 도화지
		int[][] paper = new int[100][100];
		int X = 0, Y = 0;
		
		// 10x10 크기의 색종이 입력 
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			// 색종이가 겹치는 부분을 1로 표현
			for (int i = X; i < X+10; i++) {
				for (int j = Y; j < Y+10; j++) {
					paper[i][j] = 1;
				}
			}
		}
		// 도화지 위의 색종이 영역 넓이 계산
		int cnt = 0;
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper.length; j++) {
				cnt += paper[i][j]; 
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
