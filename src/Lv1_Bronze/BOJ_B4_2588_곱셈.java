package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2588
 */
public class BOJ_B4_2588_곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A * (B%10));
		System.out.println(A * ((B/10)%10));
		System.out.println(A * (((B/10)/10)%10));
		System.out.println(A*B);
	}
}
