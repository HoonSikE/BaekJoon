package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 문자열, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1254
 */
public class BOJ_S1_1254_팰린드롬_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자열 S
		String S = br.readLine();
		int result = 0;
		
		for (int i = 0; i < S.length(); i++) {
			boolean equal = true;
			for (int j = i, index = 0; j < S.length(); j++, index++) {
				// 1문자라도 다르면 break;
				if(S.charAt(j) != S.charAt(S.length()-1-index)) {
					equal = false;
					break;
				}
			}
			// 문자 좌우가 겹친다면 새로운 문자열 크기 저장 후 break;
			if(equal) {
				result = S.length() + i;
				break;
			}
		}
		System.out.println(result);
		br.close();
	}
}
