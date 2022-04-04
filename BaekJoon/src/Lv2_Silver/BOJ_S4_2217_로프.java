package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * @author HanHoon
 * @category 수학, 그리디 알고리즘, 정렬
 * https://www.acmicpc.net/problem/2217
 */
public class BOJ_S4_2217_로프 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 로프의 개수
		int N = Integer.parseInt(br.readLine());
		// 로프당 견딜 수 있는 하중
		int[] rope = new int[N];
		for (int i = 0; i < N; i++)
			rope[i] = Integer.parseInt(br.readLine());
		Arrays.sort(rope);
		
		int result = Integer.MIN_VALUE;
		// 사용하는 로프들 중 하중을 가장 적게 견디는 로프 * 로프 개수 = 견딜 수 있는 무게
		// for문을 진행하면서 가장 약한 rope 1개씩 빼가면서 무게를 젠다
		for (int i = 0; i < N; i++)
			result = Math.max(result, rope[i] * (N-i));
		
		System.out.println(result);
		br.close();
	}
}