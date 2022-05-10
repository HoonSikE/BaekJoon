package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2739
 */
public class BOJ_B3_2739_구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int N = sc.nextInt();
		for (int i = 1; i <= 9; i++)
			str.append(N + " * " + i + " = " + (N*i) + "\n");
		System.out.println(str);
		sc.close();
	}
}
