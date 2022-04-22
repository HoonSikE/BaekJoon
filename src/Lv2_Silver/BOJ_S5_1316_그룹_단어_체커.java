package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1316
 */
public class BOJ_S5_1316_그룹_단어_체커 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int answer = T;
		for (int testcase = 1; testcase <= T; testcase++) {
			boolean[] isSelected = new boolean[26];
			String str = br.readLine();
			// 초기값
			char pre = ' ';
			for (int i = 0; i < str.length(); i++) {
				// 이전 값과 다르고 방문했다면 그룹 단어제서 제외
				if(pre != str.charAt(i) && isSelected[str.charAt(i)-'a']) {
					answer--;
					break;
				}
				// 이전 값과 같거나 방문하지 않았다면
				pre = str.charAt(i);
				isSelected[str.charAt(i)-'a'] = true;
			}
		}
		System.out.println(answer);
		br.close();
	}
}
