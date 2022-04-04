package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 그리디 알고리즘
 * https://www.acmicpc.net/problem/1789
 */
public class BOJ_S5_1789_수들의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 서로 다른 N개의 자연수의 합  S
		long S = Long.parseLong(br.readLine());
		int N = 0;
		while(S > 0) {
			S -= ++N;
		}
		// S가 딱 맞아 떨어지면 N개의 수를 더함
		// S가 음수가 된다면 모자란 만큼에 해당되는 수를 제외하고, 다음 숫자에 그 숫자를 더하게 되므로 결국 N-1이 된다.
		System.out.println(S == 0 ? N : N-1);
		br.close();
	}
}
