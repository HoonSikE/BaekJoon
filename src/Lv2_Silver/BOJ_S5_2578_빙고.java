package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2578
 */
public class BOJ_S5_2578_빙고 {
	static int bingo_cnt = 0;
	static boolean[][] isSelected;
	// 가로 빙고
	public static void check_w() {
		for (int i = 0; i < 5; i++) {
			int cnt = 0;
			for (int j = 0; j < 5; j++) {
				if(isSelected[i][j] == true)
					cnt++;
			}
			if(cnt == 5)
				bingo_cnt++;
		}
	}
	// 세로 빙고
	public static void check_h() {
		for (int j = 0; j < 5; j++) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if(isSelected[i][j] == true)
					cnt++;
			}
			if(cnt == 5)
				bingo_cnt++;
		}
	}
	// 좌상->우하 대각선 빙고
	public static void check_d1() {
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if(isSelected[i][i] == true)
				cnt++;
		}
		if(cnt == 5)
			bingo_cnt++;
	}
	// 좌하->우상 대각선 빙고
	public static void check_d2() {
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if(isSelected[i][(5-1)-i] == true)
				cnt++;
		}
		if(cnt == 5)
			bingo_cnt++;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num = -1, num_cnt = 0;
		// 5x5 빙고
		int[][] arr = new int[5][5];
		// 5x5 빙고 확인
		isSelected = new boolean[5][5];
		// 5x5 빙고값 입력
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 5x5 빙고 사회자 입력 값
		for (int n = 0; n < 25; n++) {
			if(n%5 == 0)
				st = new StringTokenizer(br.readLine(), " ");
			num = Integer.parseInt(st.nextToken());
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					// 빙고판과 사회가가 부른 값이 같다면
					if(arr[i][j] == num)
						isSelected[i][j] = true;
				}
			}
			// 사회자가 부른 숫자의 수
			num_cnt++;
			
			// 가로 빙고
			check_w();
			// 세로 빙고
			check_h();
			// 좌상->우하 대각선 빙고
			check_d1();
			// 좌하->우상 대각선 빙고
			check_d2();
			
			// 3개 이상 빙고라면 num_cnt 출력 및 for문 정지
			if(bingo_cnt >= 3) {
				System.out.println(num_cnt);
				break;
			}
			// 3개 이상 빙고가 아니라면 bingo_cnt 초기화
			bingo_cnt = 0;
		}
		br.close();
	}
}
