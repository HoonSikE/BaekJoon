package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1527
 */
public class BOJ_S1_1527_금민수의_개수 {
	static int result = 0;
	public static void makeGoldNumber(int count, int num, int N, int A, int B) {
		// 자리수가 N만큼 됐을 때
		if(count == N) {
			if(A <= num && num <= B)
				result++;
			return;
		}
		makeGoldNumber(count+1, num + 4 * (int)Math.pow(10, count), N, A, B);
		makeGoldNumber(count+1, num + 7 * (int)Math.pow(10, count), N, A, B);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// A~B 범위 내의 금민수를 구해라!
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		// 1,000,000,000 보다 작은 수로 만듦 (1자리수~9자리수)
		for (int N = 1; N < 10; N++)
			makeGoldNumber(0, 0, N, A, B);
		
		System.out.println(result);
		br.close();
	}
}
