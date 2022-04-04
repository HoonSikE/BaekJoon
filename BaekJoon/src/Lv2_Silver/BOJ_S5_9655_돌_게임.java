package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 다이나믹 프로그래밍, 게임 이론
 */
public class BOJ_S5_9655_돌_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N개의 돌
		int N = Integer.parseInt(br.readLine());
		System.out.println(N%2 == 1 ? "SK" : "CY");
		br.close();
	}
}