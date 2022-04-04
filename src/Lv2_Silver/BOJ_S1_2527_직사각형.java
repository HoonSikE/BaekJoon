package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 기하학, 많은 조건 분기
 * https://www.acmicpc.net/problem/2527
 */
public class BOJ_S1_2527_직사각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;

		// 4개의 테스트케이스
		for (int testcase = 1; testcase <= 4; testcase++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 사각형 A, B 데이터 입력 
			int Ax = Integer.parseInt(st.nextToken());
			int Ay = Integer.parseInt(st.nextToken());
			int Ap = Integer.parseInt(st.nextToken());
			int Aq = Integer.parseInt(st.nextToken());
			int Bx = Integer.parseInt(st.nextToken());
			int By = Integer.parseInt(st.nextToken());
			int Bp = Integer.parseInt(st.nextToken());
			int Bq = Integer.parseInt(st.nextToken());
			
			// 서로 범위가 겹치지 않을 때
			if(Ax>Bp||Ap<Bx||Ay>Bq||Aq<By)
				str.append('d').append("\n");
			// 좌하, 좌상 꼭지점, 좌상, 우하 꼭지점 
			else if((Ax==Bp&&Ay==Bq)||(Ap==Bx&&Aq==By)||(Ax==Bp&&Aq==By)||(Ap==Bx&&Ay==Bq))
				str.append('c').append("\n");
			// y축 선분
			else if((Ax==Bp&&(Aq>By&&Bq>Ay))||(Ap==Bx&&(Aq>By&&Bq>Ay)))
				str.append('b').append("\n");
			// x축 선분
			else if((Ay==Bq&&(Ap>Bx&&Bp>Ax))||(Aq==By&&(Ap>Bx&&Bp>Ax)))
				str.append('b').append("\n");
			// 나머지 : 사각형
			else
				str.append('a').append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
