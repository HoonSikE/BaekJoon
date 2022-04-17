package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/10430
 */
public class BOJ_B5_10430_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B+C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		br.close();
	}
}
