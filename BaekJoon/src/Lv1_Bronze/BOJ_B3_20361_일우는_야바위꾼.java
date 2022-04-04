package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_20361_일우는_야바위꾼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;
		// T : 테스트케이스 개수, br.readLine()을 int형으로 변경해준다., 범위 확인
//		int T = Integer.parseInt(br.readLine());
		int T = 1;
		if(!(1<=T&&T<=10)) { System.out.println("1<=T<=10 범위를 초과했습니다."); return;}
		
		// T만큼 반복
		for (int testcase = 1; testcase <= T; testcase++) {
			// 테스트 케이스 별 출력
//			str.append("#").append(testcase).append(" ");
			// 라인벌로 space 기준으로 토큰으로 나눔
			st = new StringTokenizer(br.readLine(), " ");
			// 토큰값을 int값으로 변경
			// N : 종이컵의 수, 범위 확인, cup 배열 생성(초기값은 false)
			int N = Integer.parseInt(st.nextToken());
			if(!(3<=N&&N<=200000)) { System.out.println("3<=N<=200,000 범위를 초과했습니다."); return;}
			boolean[] cup = new boolean[N];
			// X : 간식의 위치, 범위 확인, X번째 값은 true;
			int X = Integer.parseInt(st.nextToken());
			if(!(1<=X&&X<=N)) { System.out.println("z<=X<=" + N + "범위를 초과했습니다."); return;}
			cup[X-1] = true;
			// K : 컵의 위치를 바꾸는 횟수, 범위 확인
			int K = Integer.parseInt(st.nextToken());
			if(!(1<=K&&K<=100000)) { System.out.println("1<=K<=100,000 범위를 초과했습니다."); return;}
			// K번의 컵 위치 변경 입력
			for (int i = 0; i < K; i++) {
				// 임시값
				boolean tmp;
				st = new StringTokenizer(br.readLine(), " ");
				// 컵 A와 B의 위치를 바꿈
				int A = Integer.parseInt(st.nextToken())-1;
				int B = Integer.parseInt(st.nextToken())-1;
				tmp = cup[A];
				cup[A] = cup[B];
				cup[B] = tmp;
			}
			for (int i = 0; i < cup.length; i++) {
				// 간식이 들어있는 컵을 찾음
				if(cup[i] == true) {
					// 테스트 케이스 별 결과값 출력
					str.append(i+1).append("\n");
					break;
				}
			}
		}
		// stringbuilder에 저장된 toString 출력
		System.out.print(str);
		// BufferedReader 종료
		br.close();
	}
}
