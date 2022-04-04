package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 문자열, 그리디 알고리즘
 * https://www.acmicpc.net/problem/12904
 */
public class BOJ_G5_12904_A와_B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();
		while(S.length() < T.length()) {
			if(T.charAt(T.length()-1) == 'A')
				T = T.substring(0, T.length()-1);
			else if(T.charAt(T.length()-1) == 'B') {
				T =T.substring(0, T.length()-1);
				StringBuffer sb = new StringBuffer(T);
				T = sb.reverse().toString();
			}
		}
		if(S.toString().equals(T.toString()))
			System.out.println(1);
		else
			System.out.println(0);
		br.close();
	}
}
