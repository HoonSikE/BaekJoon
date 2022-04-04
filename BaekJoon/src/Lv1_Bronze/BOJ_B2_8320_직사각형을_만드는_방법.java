package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/8320
 */
public class BOJ_B2_8320_직사각형을_만드는_방법 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 변의 길이가 1인 정가삭형 N개
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				if(i*j <= N)
					result++;
			}
		}
		System.out.println(result);
		br.close();
	}
}
