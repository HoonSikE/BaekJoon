package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2480
 */
public class BOJ_B4_2480_주사위_세개 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 3개의 주사위 눈
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		// 3개 모두 같을 때
		if(A==B && B==C)
			System.out.println(10000+A*1000);
		// 3개 모두 다를때
		else if(A!=B && B!=C && C!=A)
			System.out.println(Math.max(A, Math.max(B, C)) * 100);
		// 3개 중 2개만 같을 때
		else
			// 경우에 따라 (A,C), (B,C) 중 하나로 선택
			if(A != B)
				System.out.println(1000 + 100*C);
			// (A,B), (A,C) 중 하나 선택
			else if(B != C)
				System.out.println(1000 + 100*A);
			// 결국 (A,B), (B,C), (C,A0 모두 실행하게 되므로 if문을 1개 더 하지 않아도 된다.
		br.close();
	}
}
