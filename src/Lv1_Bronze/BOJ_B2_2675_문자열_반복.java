package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2675
 */
public class BOJ_B2_2675_문자열_반복 {
	public static void main(String[] argu) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;
		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 반복횟수 R, 문자열 S
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			for(int i = 0; i < S.length(); i++)
				for (int j = 0; j < R; j++)
					str.append(S.charAt(i));
			str.append("\n");
		}
		System.out.print(str);
		br.close();
	}
}
