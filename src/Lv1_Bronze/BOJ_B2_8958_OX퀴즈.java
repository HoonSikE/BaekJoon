package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/8958
 */
public class BOJ_B2_8958_OX퀴즈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= T; testcase++) {
			int result = 0;
			char[] OX = br.readLine().toCharArray();
			
			int score = 0;
			for (char c : OX) {
				if(c == 'O') {
					score++;
					result += score;
				}else
					score = 0;
			}
			str.append(result).append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
