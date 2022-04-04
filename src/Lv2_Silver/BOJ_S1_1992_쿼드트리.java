package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S1_1992_쿼드트리 {
	static int[][] arr;
	static StringBuilder result = new StringBuilder();
	// 압축이 가능한지 판단하는 함수
	public static boolean isPossible(int size, int startY, int startX) {
		// 초기값 입력
		int data = arr[startY][startX];
		for (int i = startY; i < startY + size; i++) {
			for (int j = startX; j < startX + size; j++) {
				// 1개라도 틀리면 압축 불가
				if(data != arr[i][j])
					return false;
			}
		}
		return true;
	}
	public static void QuadTree(int size, int startY, int startX) {
		// 압축이 가능하다면 값 출력
		// size가 1이됐을때는 무조건 가능하므로 따로 size값에 대한 return 설정 불필요
		if(isPossible(size, startY, startX)) {
			result.append(arr[startY][startX]);
			return;
		}
		// 압축 불가능하면 괄호 열어줌
		result.append("(");
		// 1구역 (좌상)
		QuadTree(size/2, startY, startX);
		// 2구역 (우상)
		QuadTree(size/2, startY, startX+size/2);
		// 3구역 (좌하)
		QuadTree(size/2, startY+size/2, startX);
		// 4구역 (우하)
		QuadTree(size/2, startY+size/2, startX+size/2);
		result.append(")");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for (int n = 0; n < N; n++) {
			String str = br.readLine();
			for (int m = 0; m < N; m++) {
				arr[n][m] = str.charAt(m) - '0';
			}
		}
//--------------------------데이터 입력-------------------------------------
		QuadTree(N, 0, 0);
		
		System.out.println(result.toString());
		br.close();
	}
}
