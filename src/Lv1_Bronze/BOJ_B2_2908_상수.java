package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/2908
 */
public class BOJ_B2_2908_상수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		
		System.out.println(A > B ? A : B);
		
		br.close();
	}
}
