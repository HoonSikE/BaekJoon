package Lv2_Silver;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 정수론, 소수 판정, 에라토스테네스의 체
 * https://www.acmicpc.net/problem/1929
 */
public class BOJ_S3_1929_소수_구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// M이상 N이하의 수
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean[] arr = new boolean[N+1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;
		
		for (int i = 2; i <= N; i++) {
			if(!arr[i]) continue;
			for (int j = i+i; j <= N; j+=i)
				arr[j] = false;
		}
		
		for (int i = M; i <= N; i++) {
			if(arr[i])
				System.out.println(i);
		}
		sc.close();
	}
}
