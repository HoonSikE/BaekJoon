package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/10870
 */
public class BOJ_B2_10870_피보나치_수_5 {
	public static int backtracking(int N) {
		// 초기값
		if(N==0) return 0;
		if(N==1) return 1;
		// 문제에 식에 대한 답이 있다..
		return backtracking(N-1) + backtracking(N-2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(backtracking(N));
		br.close();
	}
}
