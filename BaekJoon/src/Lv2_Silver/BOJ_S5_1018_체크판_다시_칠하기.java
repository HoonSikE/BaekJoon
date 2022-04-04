package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1018
 */
public class BOJ_S5_1018_체크판_다시_칠하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// MxN 크기의 보드
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] map = new char[N][M]; 
		// W : 흰색, B : 검정색
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		// 좌측위가 흰색인 경우
		int resultW = Integer.MAX_VALUE;
		// 좌측 위가 검정색인 경우
		int resultB = Integer.MAX_VALUE;
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				// 경우마다 cnt값
				int cntW = 0, cntB = 0;
				for (int n = i; n < i+8; n++) {
					for (int m = j; m < j+8; m++) {
						// 좌측위가 흰색인 경우
						if((n-i+m-j)%2 == 0 && map[n][m] == 'W')
							cntW++;
						else if((n-i+m-j)%2 == 1 && map[n][m] == 'B')
							cntW++;
						// 좌측 위가 검정색인 경우
						if((n-i+m-j)%2 == 0 && map[n][m] == 'B')
							cntB++;
						else if((n-i+m-j)%2 == 1 && map[n][m] == 'W')
							cntB++;
					}
				}
				resultW = Math.min(resultW, cntW);
				resultB = Math.min(resultB, cntB);
			}
		}
		System.out.println(Math.min(resultW, resultB));
		br.close();
	}
}
