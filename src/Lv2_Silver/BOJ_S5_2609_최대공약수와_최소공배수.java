package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 정수론, 유클리드 호제법
 * https://www.acmicpc.net/problem/2609
 */
public class BOJ_S5_2609_최대공약수와_최소공배수 {
	public static int getGCD(int A, int B) {
		if(A%B == 0)
			return B;
		return getGCD(B, A%B);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder str = new StringBuilder();
		// 두개의 자연수
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int gcd = getGCD(Math.max(A, B), Math.min(A, B));
		str.append(gcd).append("\n");
		str.append(A*B/gcd);
		
		System.out.println(str);
		br.close();
	}
}
