package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 다이나믹 프로그래밍, 그리디 알고리즘
 * https://www.acmicpc.net/problem/2839
 */
public class BOJ_B1_2839_설탕_배달_for_if {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 배달할 설탕 Nkg
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		// 설탕은 3kg, 5kg 2가지가 있다
		while(N>=0) {
			if(N%5==0) {
				cnt += N/5;
				System.out.println(cnt);
				return;
			}
			N -= 3;
			cnt++;
		}
		System.out.println(-1);
		br.close();
	}
}
