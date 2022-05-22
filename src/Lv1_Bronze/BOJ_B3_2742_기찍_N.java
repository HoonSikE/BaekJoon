package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2742
 */
public class BOJ_B3_2742_기찍_N {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = N; i >= 1; i--)
			str.append(i+"\n");
		System.out.println(str);
		br.close();
	}
}
