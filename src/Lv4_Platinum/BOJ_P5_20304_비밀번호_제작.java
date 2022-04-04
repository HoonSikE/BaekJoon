package Lv4_Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_P5_20304_비밀번호_제작 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// N : 패스워드 최대값, 범위 확인
		int N = Integer.parseInt(br.readLine());
		if(!(0<=N&&N<=1000)) { System.out.println("0<=N<=1,000 범위를 초과했습니다."); return;}
		// M : 해커가 사용한 패스워드 개수, 토큰을 int형으로 변경해준다., 범위 확인
		int M = Integer.parseInt(br.readLine());
		if(!(0<=M&&M<=1000)) { System.out.println("0<=M<=1,000 범위를 초과했습니다."); return;}
		// P : 해커가 사용한 패스워드를 담을 배열
		int[] P = new int[M];
		// P값을 2진수로 변경한 배열
		String[] binary = new String[M];
		int security = Integer.MAX_VALUE;
		
		// 라인벌로 space 기준으로 토큰으로 나눔
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			// p에 해커가 사용한 패스워드값 입력
			P[i] = Integer.parseInt(st.nextToken());
			// 2진수 변환 최소 1회 실행
			int bi = P[i]%2;
			int tmp = P[i]/2;
			binary[i] = bi + "";
			// 입력값을 2진수로 표현
			while(true) {
				if(tmp ==0) break;
				if(tmp == 1) {
					binary[i] = tmp + binary[i];
					break;
				}
				bi = tmp%2;
				tmp = tmp/2;
				binary[i] = bi + binary[i];
			}
			
		}
		// 사용자 패스워드 이진수값
		// 사용자 패스워드 범위 0~N(1,000)만큼 반복
		for (int j = 0; j < N; j++) {
			String string = null;
			// 2진수 변환 최소 1회 실행
			int bi2 = j%2;
			int tmp2 = j/2;
			string = bi2 + "";
			// 입력값을 2진수로 표현
			while(true) {
				if(tmp2 ==0) break;
				if(tmp2 == 1) {
					string = tmp2 + string;
					break;
				}
				bi2 = tmp2%2;
				tmp2 = tmp2/2;
				string = bi2 + string;
			}	
/**
 * 2진수 변환까지 완료
 * 사용자키, 해커키 비교 부분 미완성
 */
//			for (int i = 0; i < M; i++) {
//				int cnt = 0;
//				if(string.charAt(i) != binary[i].charAt(i))
//					security++;
//				if(security > cnt)
//					security = cnt;
//			}
		}
		System.out.println(security);
		// BufferedReader 종료
		br.close();
	}
}
