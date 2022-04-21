package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/2753
 */
public class BOJ_B4_2753_윤년 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 윤년 : 4의 배수이면서 100의 배수가 아닐때 혹은 400의 배수 일 때
		if((year%4 == 0 && year%100 !=0) || year%400 == 0)
			System.out.println(1);
		else
			System.out.println(0);
		sc.close();
	}
}
