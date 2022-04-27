package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1152
 */
public class BOJ_B2_1152_단어의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.println(count);
		br.close();
	}
}
