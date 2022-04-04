package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/3052
 */
public class BOJ_B2_3052_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 42로 나누었을때의 나머지들
		boolean[] rest = new boolean[42];
		// 10개의 숫자 입력
		for (int i = 0; i < 10; i++) {
			rest[Integer.parseInt(br.readLine())%42] = true;
		}
		int result = 0;
		for (boolean b : rest) {
			if(b == true) 
				result++;
		}
		System.out.println(result);
		br.close();
	}
}
