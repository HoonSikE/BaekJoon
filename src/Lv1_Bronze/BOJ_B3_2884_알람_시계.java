package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2884
 */
public class BOJ_B3_2884_알람_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M >= 45)
			M -= 45;
		else {
			if(H > 0)
				H -= 1;
			else
				H = 23;
			M += 15;
		}
			
		System.out.println(H + " " + M);
	}
}
