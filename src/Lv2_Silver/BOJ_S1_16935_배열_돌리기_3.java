package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S1_16935_배열_돌리기_3 {
	static int N, M, map[][], result[][];
	public static void swap() {
		int temp = N;
		N = M;
		M = temp;
	}
	public static void move1() {
		result = new int[N][M];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				result[i][j] = map[(N-1)-i][j];
		map = result;
	}
	public static void move2() {
		result = new int[N][M];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				result[i][j] = map[i][(M-1)-j];
		map = result;
	}
	public static void move3() {
		result = new int[M][N];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				result[i][j] = map[(N-1)-j][i];
		swap();
		map = result;
	}
	public static void move4() {
		result = new int[M][N];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				result[i][j] = map[j][(M-1)-i];
		swap();
		map = result;
	}
	public static void move5() {
		result = new int[N][M];
		for (int i = 0; i < N; i++) {
			if(i < N/2) {
				for (int j = 0; j < M; j++) {
					if(j < M/2)
						result[i][j] = map[i+(N/2)][j];
					else
						result[i][j] = map[i][j-(M/2)];
				}
			}else {
				for (int j = 0; j < M; j++) {
					if(j < M/2)
						result[i][j] = map[i][j+(M/2)];
					else
						result[i][j] = map[i-(N/2)][j];
				}					
			}
		}
		map = result;
	}
	public static void move6() {
		result = new int[N][M];
		for (int i = 0; i < N; i++) {
			if(i < N/2) {
				for (int j = 0; j < M; j++) {
					if(j < M/2)
						result[i][j] = map[i][j+(M/2)];
					else
						result[i][j] = map[i+(N/2)][j];
				}
			}else {
				for (int j = 0; j < M; j++) {
					if(j < M/2)
						result[i][j] = map[i-(N/2)][j];
					else
						result[i][j] = map[i][j-(M/2)];
				}					
			}
		}
		map = result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		// NxM 배열 크기 (짝수)
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		// R번 반복
		int R = Integer.parseInt(st.nextToken());
		// NxM배열 선언
		map = new int[N][M];
		//배열에 데이터 입력
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 수행 연산 번호 num
		st=new StringTokenizer(br.readLine());
		// R번 반복
		for (int tc = 0; tc < R; tc++) {
			int num = Integer.parseInt(st.nextToken());

			switch(num) {
			// 상하 반전
			case 1:
				move1();
				break;
			// 좌우 반전
			case 2:
				move2();
				break;
			// 시계방향 90도 회전
			case 3:
				move3();
				break;
			// 반시계방향 90도 회전
			case 4:
				move4();
				break;
			// 4분할 시계 방향 90도 회전
			case 5:
				move5();
				break;
			// 4분할 반시계 방향 90도 회전
			case 6:
				move6();
				break;
			default: break;
			}
		}
		//출력---------------------------------------------------
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
