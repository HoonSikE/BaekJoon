package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 구현, 정수론, 소수 판정
 * https://www.acmicpc.net/problem/2824
 */
public class BOJ_G5_2824_최대공약수 {
	public static long gcd(long a, long b) {
		if(a%b == 0) return b;
		return gcd(b, a%b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// N개의 수
		int N = Integer.parseInt(br.readLine());
		long[] arr1 = new long[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			arr1[i] = Long.parseLong(st.nextToken());
		// M개의 수
		int M = Integer.parseInt(br.readLine());
		long[] arr2 = new long[M];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++)
			arr2[i] = Long.parseLong(st.nextToken());
		// 모든 경우의 수에 대해 진행을 해 최대공배수를 구한다.
		long tmp = 1l;
		for (int i = 0; i < N; i++) {
			if(arr1[i] == 1) continue;
			for (int j = 0; j < M; j++) {
				if(arr2[j] == 1) continue;
				long gcd = gcd(Math.max(arr1[i], arr2[j]), Math.min(arr1[i], arr2[j]));
				tmp *= gcd;
				// 어차피 10자리 이상은 필요 없으므로 오버플로우 방지를 위해 10자리수 이하로 유지한다.
				if(tmp >= 10000000000l)
					tmp %= 10000000000l;
				arr1[i] /= gcd;
				arr2[j] /= gcd;
			}
		}
		String result = tmp + "";
		if(result.length() > 9)
			result = result.substring(result.length()-9);
		System.out.println(result);
		br.close();
	}
}
