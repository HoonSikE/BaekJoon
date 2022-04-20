package Lv1_Bronze;

import java.util.Scanner;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/9498
 */
public class BOJ_B4_9498_시험_성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(90<=score&&score<=100)
			System.out.println("A");
		else if(80<=score&&score<90)
			System.out.println("B");
		else if(70<=score&&score<80)
			System.out.println("C");
		else if(60<=score&&score<70)
			System.out.println("D");
		else
			System.out.println("F");
		sc.close();
	}
}
