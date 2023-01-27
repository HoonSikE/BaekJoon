package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/10809
 */
public class BOJ_B5_10809_알파벳_찾기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();

		// 알파벳 만큼의 길이
		int[] arr = new int['z'-'a'+1];
		// 초기값을 -1로 설정
		Arrays.fill(arr, -1);

		// 단어 S
		String S = br.readLine();
		for (int i = 0; i < S.length(); i++) {
			if(arr[S.charAt(i)-'a'] == -1)
				arr[S.charAt(i) - 'a'] = i;
		}

		for(int i : arr)
			str.append(i).append(" ");

		System.out.println(str);
		br.close();
	}
}
