package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2804
 */
public class BOJ_B2_2804_크로스워드_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		char[] A = st.nextToken().toCharArray();
		char[] B = st.nextToken().toCharArray();
		
		int idx_A = -1;
		int idx_B = -1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i] == B[j]) {
					idx_A = i;
					idx_B = j;
					break;
				}
			}
			if(idx_A != -1 || idx_B != -1)
				break;
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < A.length; j++) {
				// 크로스값 출력
				if(idx_A == j && idx_B == i)
					str.append(A[j]);	// == B[i]
				// A 가로로 출력
				else if(idx_B == i)
					str.append(A[j]);
				// B 세로로 출력
				else if(idx_A == j)
					str.append(B[i]);
				// 나머지는 점으로 출력
				else
					str.append(".");
			}
			str.append("\n");
		}

		System.out.println(str.toString());
		br.close();
	}
}
