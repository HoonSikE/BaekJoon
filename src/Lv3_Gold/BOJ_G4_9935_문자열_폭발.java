package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 자료구조, 문자열, 스택
 * https://www.acmicpc.net/problem/9935
 */
public class BOJ_G4_9935_문자열_폭발 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 주어진 문자열
		String string = br.readLine();
		// C4 문자열
		String C4 = br.readLine(); 
		// 결과값 초기
		char[] answer = new char[string.length()];
		// answer의 index
		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			// 문자열의 끝이 C4의 끝과 같고, 길이가 C4보다 길다면
			if(string.charAt(i) == C4.charAt(C4.length()-1) && index >= C4.length()-1) {
				// C4가 들어있는지 확인
				boolean flag = true;
				for (int j = 0; j <= C4.length()-2; j++) {
					if(answer[index-(C4.length()-1)+j] != C4.charAt(j)) {
						flag = false;
						break;
					}
				}
				// C4가 있다면 그만큼 index를 앞으로 이전시키고 continue
				if(flag) {
					index -= (C4.length()-1);
					continue;
				}
			}
			// 폭탄이 없으면 문자열을 추가한다.
			answer[index++] = string.charAt(i);	
		}
		// 문자열이 모두 폭파되었다면 FRULA
		if(index == 0)
			str.append("FRULA");
		else
			for (int i = 0; i < index; i++)
				str.append(answer[i]);
		System.out.println(str);
		br.close();
	}
}
