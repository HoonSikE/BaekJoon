package Lv2_Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * @author HanHoon
 * @category 문자열, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/8892
 */
public class BOJ_S5_8892_팰린드롬 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 테스트 케이스 T
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			// 공책에 적혀져 있는 단어의 수
			int K = Integer.parseInt(br.readLine());
			String[] word = new String[K];
			
			for (int i = 0; i < K; i++)
				word[i] = br.readLine();
			
			boolean print = true;
			// 모든 경우 조합
			end: for (int i = 0; i < K; i++) {
				for (int j = 0; j < K; j++) {
					if(i==j) continue;
					String tmp = word[i] + word[j];
					boolean flag = true;
					for (int k = 0; k < tmp.length()/2; k++) {
						if(tmp.charAt(k) != tmp.charAt(tmp.length()-1-k)) {
							flag = false;
							break;
						}
					}
					if(flag) {
						str.append(tmp).append("\n");
						print = false;
						break end;
					}
				}
			}
			if(print)
				str.append(0).append("\n");
		}
		System.out.print(str);
		br.close();
	}
}
