package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/8393
 */
public class BOJ_B5_8393_합 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(n*(n+1)/2);
		br.close();
	}
}
