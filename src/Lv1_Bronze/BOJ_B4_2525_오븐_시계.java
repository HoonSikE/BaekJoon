package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2525
 */
public class BOJ_B4_2525_오븐_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 현재 시각 시(A), 분(B)
		int A = sc.nextInt();
		int B = sc.nextInt();
		// 요리하는데 걸리는 시간 C(분 단위
		int C = sc.nextInt();
		// 종료되는 시간
		System.out.println((A+(int)(C/60)+(int)((B+C%60)/60))%24+" "+(B+C%60)%60);
		sc.close();
	}
}
