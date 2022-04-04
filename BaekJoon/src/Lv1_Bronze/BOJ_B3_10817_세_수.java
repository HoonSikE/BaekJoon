package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10817
 */
public class BOJ_B3_10817_세_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 세 정수 A, B, C
		int[] intArr = new int[3];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(intArr);
		System.out.println(intArr[1]);
	}
}
