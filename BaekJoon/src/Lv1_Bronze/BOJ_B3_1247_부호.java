package Lv1_Bronze;
/*
 * BigInteger는 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기 때문에 어떠한 숫자든지 담을 수 있다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도/큰 수 연산
 * https://www.acmicpc.net/problem/1247
 */
public class BOJ_B3_1247_부호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();

		int T = 3;
		for (int testcase = 0; testcase < T; testcase++) {
			int N = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for (int i = 0; i < N; i++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			if(sum.compareTo(new BigInteger("0")) > 0)
				str.append("+").append("\n");
			else if (sum.compareTo(new BigInteger("0")) < 0)
				str.append("-").append("\n");
			else
				str.append("0").append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
