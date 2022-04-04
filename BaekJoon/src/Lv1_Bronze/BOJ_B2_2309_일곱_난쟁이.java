package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘, 정렬
 * https://www.acmicpc.net/problem/2309
 */
public class BOJ_B2_2309_일곱_난쟁이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 9명의 난쟁이
		int[] arr = new int[9];
		int sum = 0;
		// 9명의 난쟁이 키를 받아옴
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		// 정렬
		Arrays.sort(arr);

		// 스파이 2명
		int spy1 = -1, spy2 = -1;
		// 9명 키 - 스파이 2명 키 = 100
		for (int i = 0; i < 9-1; i++) {
			for (int j = i+1; j < 9; j++) {
				if((sum - arr[i] - arr[j]) == 100) {
					spy1 = i;
					spy2 = j;
					break;
				}
			}
		}
		// 스파이 2명 제외 하고 출력
		for (int n = 0; n < 9; n++) {
			if(n==spy1 || n==spy2)
				continue;
			System.out.println(arr[n]);
		}
	}
}
