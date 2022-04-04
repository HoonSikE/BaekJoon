package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2116
 */
public class BOJ_G4_2116_주사위_쌓기 {
	static int N, result;
	public static void getDice(int[][] tmp, int num) {
		int sum = 0;
		int tmp_num = num;
		// 이전 주사위윗면 == 다음 주사위 아랫면인 부분을 찾음
		for (int n = 0; n < tmp.length; n++) {
			for (int m = 0; m < tmp[n].length; m++) {
				if(tmp[n][m] == tmp_num) {
					int index = m;
					// 아랫면 값 0으로 바꿔줌
					tmp[n][index] = 0;
					// 반대편 값 index에 저장
					switch(index) {
					// A -> F
					case 0: index = 5; break;
					// B -> D
					case 1: index = 3; break;
					// C -> E
					case 2: index = 4; break;
					// D -> B
					case 3: index = 1; break;
					// E -> C
					case 4: index = 2; break;
					// F -> A
					case 5: index = 0; break;
					}
					// tmp_num값을 윗면으로 바꿈
					tmp_num = tmp[n][index];
					// 윗면값 0으로 바꿔줌
					tmp[n][index] = 0;
					break;
				}
			}
		}
		for (int[] di : tmp) {
			int max = Integer.MIN_VALUE;
			// 주사위별 옆 면 최대값을 구함
			for (int n : di) {
				max = max < n ? n : max;
			}
			sum += max;
		}
		// 최대값 최신화
		result = result < sum ? sum : result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 주사위 개수
		N = Integer.parseInt(br.readLine());
		int[][] dice = new int[N][6];
		result = 0;
		for (int i = 0; i < N; i++) {
			/* 주사위 모양이 아래와 같이 A B C D E F 순으로 입력
			 * 	 A
			 * B C D E
			 *   F
			 */
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 6; j++) {
				dice[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		// 밑면이 1인경우 ~ 6인경우 까지 경우의 수
		for (int i = 0; i < 6; i++) {
			int[][] tmp = new int[N][6];
			for (int n = 0; n < tmp.length; n++)
				for (int m = 0; m < tmp[n].length; m++)
					tmp[n][m] = dice[n][m];
			getDice(tmp, i+1);
		}
		
		System.out.println(result);
		br.close();
	}
}
