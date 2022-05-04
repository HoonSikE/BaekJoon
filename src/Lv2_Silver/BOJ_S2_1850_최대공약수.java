package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 정수론, 유클리드 호제법
 * https://www.acmicpc.net/problem/1850
 * 
 * 다짜고짜 1로 이루어진 숫자를 구하려고 하면 안된다.
 * 유클리드 호제법을 활용하면
 * 1111 = 111x10 + 1
 * 111 = 11x10 + 1
 * 11 = 1x10 + 1
 * 이런식으로 추론할 수 있다.
 */
public class BOJ_S2_1850_최대공약수 {
	public static long gcd(long a, long b) {
		if(a%b == 0)
			return b;
		return gcd(b, a%b);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder str = new StringBuilder();
		// A의 길이만큼 1로 이루어진 a
		long A = Long.parseLong(st.nextToken());
		// B의 길이만큼 1로 이루어진 b
		long B = Long.parseLong(st.nextToken());
		// 유클리드 호제법을 활용해서 최대공약수를 구함
		for (long i = 0; i < gcd(Math.max(A, B), Math.min(A, B)); i++)
			str.append("1");
		
		System.out.println(str);
		br.close();
	}
}
