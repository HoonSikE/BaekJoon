package Lv2_Silver;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 정수론, 소수 판정, 에라토스테네스의 체
 * https://www.acmicpc.net/problem/1747
 */
public class BOJ_S1_1747_소수와_팰린드롬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 배열을 선언하고 모든 값을 true라고 한다.
		boolean[] arr = new boolean[1005000];
		Arrays.fill(arr, true);
		// 0과 1은 소수가 아니다
		arr[0] = false;
		arr[1] = false;
		// 2부터 시작
		for (int i = 2; i < arr.length; i++) {
			// treu라면 이 값은 소수가 아니므로 확인할 필요가 없다.
			if(!arr[i]) continue;
			// 이 값의 배수는 모두 소수가 아니다.
			for (int j = i+i; j < arr.length; j += i) {
				arr[j] = false;
			}
		}

		// N보다 큰 첫번째 소수
		for (int i = N; i < arr.length; i++) {
			if(arr[i]) {
				// 그중에서 펠린드롬인 수를 출력
				String tmp = i+"";
				boolean flag = true;
				for (int j = 0; j < tmp.length()/2; j++)
					if(tmp.charAt(j) != tmp.charAt(tmp.length()-1-j))
						flag = false;
				if(flag) {
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
	}
}
