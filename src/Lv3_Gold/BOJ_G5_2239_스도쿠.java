package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 백트래킹
 * https://www.acmicpc.net/problem/2239
 */
public class BOJ_G5_2239_스도쿠 {
	static int N = 9;
	static int[][] sdocu;
	static boolean complete = false;
	char[][] result = new char[9][9];
	public static boolean checkNumber(int y, int x, int num) {
		// 가로 세로 확인
		for (int i = 0; i < N; i++)
			if(sdocu[y][i] == num || sdocu[i][x] == num)
				return false;
		// 해당 블럭 내 확인
		int startY = y/3*3;
		int startX = x/3*3;
		for (int i = startY; i < startY+3; i++)
			for (int j = startX; j < startX+3; j++)
				if(sdocu[i][j] == num)
					return false;
		return true;
	}
	public static void backtracking(int count) {
		if(count == N*N) {
			complete = true;
			return;
		}
		int y = count / 9;
		int x = count % 9;
		if(sdocu[y][x] != 0) {
			backtracking(count+1);
		}else {
			// 1~9의 숫자 확인
			for (int i = 1; i <= 9; i++) {
				if(!checkNumber(y, x, i)) continue;
				sdocu[y][x] = i;
				backtracking(count+1);
				if(complete) return;
				sdocu[y][x] = 0;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();

		sdocu = new int[9][9];
		// 값 입력
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < N; j++)
				sdocu[i][j] = tmp.charAt(j) - '0';
		}
		backtracking(0);
		// 값 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(sdocu[i][j]);
			System.out.println();
		}
		System.out.println(str.toString());
		br.close();
	}
}
