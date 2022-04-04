package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2231
 */
public class BOJ_B2_2231_분해합 {
	static int N;
	public static boolean create(int i) {
		int result = i, temp = i;
		while(temp!=0) {
			result += temp%10;
			temp /= 10;
		}
		if(result == N)
			return true;
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 자연수 N
		N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= 1000000; i++) {
			if(create(i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		br.close();
	}
}
