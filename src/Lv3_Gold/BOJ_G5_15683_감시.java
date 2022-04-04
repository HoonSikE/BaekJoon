package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘, 시뮬레이션
 * https://www.acmicpc.net/problem/15683
 */
class CCTV {
	int Row;
	int Col;
	int Number;
	// 좌하우상
	int Direction;
	public CCTV(int row, int col, int number, int direction) {
		Row = row;
		Col = col;
		Number = number;
		Direction = direction;
	}
}
public class BOJ_G5_15683_감시 {
	static int N, M;
	static int result = Integer.MAX_VALUE;
	static int[][] map;
	static int[][] tmp;
	static ArrayList<CCTV> list = new ArrayList<>();
	// 좌하우상
	static int[] dRow = { 0, 1, 0,-1};
	static int[] dCol = {-1, 0, 1, 0};
	// 구역 내 사각지대 계산
	public static void calculate() {
		int count = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				// 아직 복도인곳 == 사각지대
				if(tmp[i][j] == 0)
					count++;
		// 최소값 최신화
		result = Math.min(result, count);
	}
	// index 방향으로 check
	public static void checkFunction(int Row, int Col, int index){
		while(true) {
			Row += dRow[index];
			Col += dCol[index];
			// 범위에서 벗어나거나 벽을 만난다면 return;
			if(Row < 0 || Row >= N || Col < 0 || Col >= M || tmp[Row][Col] == 6) 
				return;
			// 탐지된 구역은 -1로 변경
			tmp[Row][Col] = -1;
		}
	}
	public static void checkBlindSpot(){
		// map을 사용하게 되면 값이 변해서 2번쨰 시도부터 꼬이게 되기때문에 임시값 사용
		for (int i = 0; i < N; i++)
			tmp[i] = map[i].clone();
		// 모든 CCTV에 대해 감시 실시
		for (CCTV cctv : list) {
			switch (cctv.Number) {
				// 1쪽 방향
				case 1:
					checkFunction(cctv.Row, cctv.Col, cctv.Direction);
					break;
				// 양 방향
				case 2:
					checkFunction(cctv.Row, cctv.Col, cctv.Direction);
					checkFunction(cctv.Row, cctv.Col, (cctv.Direction+2)%4);
					break;
				// 직각 방향
				case 3:
					for (int index = 0; index < 2; index++)
						checkFunction(cctv.Row, cctv.Col, (cctv.Direction+index)%4);
					break;
				// 앞, 좌우
				case 4:
					for (int index = 0; index < 3; index++)
						checkFunction(cctv.Row, cctv.Col, (cctv.Direction+index)%4);
					break;
				// 4방향
				case 5:
					for (int index = 0; index < 4; index++)
						checkFunction(cctv.Row, cctv.Col, (cctv.Direction+index)%4);
					break;
			}
		}
	}
	public static void checkCCTV(int count){
		// 모든 CCTV를 확인했으면 return;
		if(count == list.size()) {
			// 모든 CCTV에 대해 감시 실시
			checkBlindSpot();
			// 구역 내 사각지대 계산
			calculate();
			return;
		}
		// 현재 CCTV 방향 설정 후 재귀로 모든 방향에 대한 경우의수 실행
		CCTV cctv = list.get(count);
		// CCTV별 방향 설정 (기본방향은 0으로 설정되어있으므로 바로 재귀 실시)
		switch(cctv.Number){
			// 2: 2방향(좌우,하상)
			case 2:
				cctv.Direction = 0; checkCCTV(count+1);
				cctv.Direction = 1; checkCCTV(count+1);
				break;
			// 5: 1방향(좌하우상)
			case 5:
				cctv.Direction = 0; checkCCTV(count+1);
				break;
			// 1,3,4: 4방향(좌,하,우,상)
			default:
				cctv.Direction = 0; checkCCTV(count+1);
				cctv.Direction = 1; checkCCTV(count+1);
				cctv.Direction = 2; checkCCTV(count+1);
				cctv.Direction = 3; checkCCTV(count+1);
				break;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// NxM 크기의 사무실
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		// 사무실 데이터 입력 0:복도, 1~5:CCTV, 6:벽
		map = new int[N][M];
		tmp = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				// CCTV 추가
				if(1 <= map[i][j] && map[i][j] <= 5)
					list.add(new CCTV(i, j, map[i][j], 0));
			}
		}
		checkCCTV(0);
		System.out.println(result);
		br.close();
	}
}
