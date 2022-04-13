package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/16926
 */
public class BOJ_S2_16926_배열_돌리기_1 {
	private static int[] dx = {0,1,0,-1};  //하우상좌
	private static int[] dy = {1,0,-1,0};  //하우상좌
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //행
		int M = Integer.parseInt(st.nextToken()); //열
		int R = Integer.parseInt(st.nextToken()); //회전 수
		
		int[][] map = new int[N][M]; //배열 선언
		//배열에 데이터 입력
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//회전해야 할 사각형의 수
		//2*2 행렬에서는 1개, 5*5에서는 2개, 4*5에서는 2개, 최솟값을 2로 나누면 그룹 수가 나온다
		//이 규칙에서 항상 시작점은 x,y값이 같은 값에서 시작
		int cnt = Math.min(N, M) / 2;  
		//회전횟수
		for(int i=0;i<R;i++) {
			//그룹 갯수만큼 반복
			for(int j=0;j<cnt;j++) {
				int x = j;
				int y = j;
				
				//나중에 값을 넣기 위해 따로 저장
				int tmp = map[x][y];
				int dic=0;      // 방향
				
				while(dic<4) {
					int nx = x + dx[dic];
					int ny = y + dy[dic];
					
					if(nx>=j && ny>=j && nx<N-j && ny<M-j) {  //범위 내에 있을 경우 돌리기
						map[x][y] = map[nx][ny];
						x = nx;
						y = ny;
					}else {                                   //범위 벗어나면 방향 전환
						dic++;
					}
				}
				map[j+1][j] = tmp;
			}
		}//end for
		//출력---------------------------------------------------
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
