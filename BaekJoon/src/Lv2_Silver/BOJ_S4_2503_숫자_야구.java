package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2503
 */
public class BOJ_S4_2503_숫자_야구 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// N번의 질문
		int N = Integer.parseInt(br.readLine());
		String[] Q = new String[N];
		int[] strike = new int[N];
		int[] ball = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 질문한 세자리 수, 스트라이크 개수, 볼 개수
			Q[i] = st.nextToken();
			strike[i] = Integer.parseInt(st.nextToken());
			ball[i] = Integer.parseInt(st.nextToken());
		}
		int result = 0;
		/// 123 ~ 987 모든 경우의 수 확인 (중복x)
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i == j) continue;
				for (int k = 1; k < 10; k++) {
					if(i == k || j == k) continue;
					boolean flag = true;
					// 모든 질문에 해당하는 숫자 확인
					for (int n = 0; n < N; n++) {
						int s_cnt = 0, b_cnt = 0;
						// 스트라이크 확인
						if(Q[n].charAt(0) - '0'== i)
							s_cnt++;
						if(Q[n].charAt(1) - '0'== j)
							s_cnt++;
						if(Q[n].charAt(2) - '0'== k)
							s_cnt++;
						// 볼 확인
						if(Q[n].charAt(0) - '0'== j || Q[n].charAt(0) - '0'== k)
							b_cnt++;
						if(Q[n].charAt(1) - '0'== i || Q[n].charAt(1) - '0'== k)
							b_cnt++;
						if(Q[n].charAt(2) - '0'== i || Q[n].charAt(2) - '0'== j)
							b_cnt++;
						// 조건 중 1개라도 안 맞으면 예상하지 않는 수
						if(strike[n] != s_cnt || ball[n] != b_cnt) {
							flag = false;
							break;
						}
					}
					if(flag) result++;
				}
			}
		}
		System.out.println(result);
		br.close();
	}
}
