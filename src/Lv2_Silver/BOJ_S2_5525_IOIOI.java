package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 문자열
 * https://www.acmicpc.net/problem/5525
 */
public class BOJ_S2_5525_IOIOI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자열 규칙 Pn의 번호
		int N = Integer.parseInt(br.readLine());
		// S의 길이
		int M = Integer.parseInt(br.readLine());
		// 길이 M의 문자열
		String S = br.readLine();
		
		int result = 0;
		int count = 0;
		for (int i = 0; i < M-2; i++) {
			// IOI일 경우 count++;
			if(S.charAt(i) == 'I' && S.charAt(i+1) == 'O' && S.charAt(i+2) == 'I') {
				count++;
				// IOI가 N번 나오면 결국 Pn이 1번 포함된다.
				if(count == N) {
					result++;
					// IOI 1칸만 없애고 다음 비교
					count--;
				}
				// O에서 비교하면 count = 0이 되어버리므로 바로 다음 I를 비교할 수 있게 i++를 해준다.
				i++;
			}
			else
				count = 0;
		}
		System.out.println(result);
		br.close();
	}
}
