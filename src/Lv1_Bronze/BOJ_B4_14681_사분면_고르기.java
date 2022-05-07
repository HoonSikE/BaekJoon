package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 구현, 기하학
 * https://www.acmicpc.net/problem/14681
 */
public class BOJ_B4_14681_사분면_고르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt() > 0)
			if(sc.nextInt() > 0)
				System.out.println("1");
			else
				System.out.println("4");
		else
			if(sc.nextInt() > 0)
				System.out.println("2");
			else
				System.out.println("3");
		sc.close();
	}
}
