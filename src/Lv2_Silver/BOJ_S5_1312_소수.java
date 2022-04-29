package Lv2_Silver;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/1312
 */
public class BOJ_S5_1312_소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A : 분자, B : 분모
		int A = sc.nextInt();
		int B = sc.nextInt();
		// 소숫점 아래 N번째 수
		int N = sc.nextInt();
		int num = A%B;
		for (int i = 0; i < N-1; i++) {
			num *= 10;
			num %= B;
		}
		num *= 10;
		System.out.print(num/B);
		sc.close();
	}
}
