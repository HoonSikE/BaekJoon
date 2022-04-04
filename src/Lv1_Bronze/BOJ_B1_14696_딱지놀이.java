package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/14696
 */
public class BOJ_B1_14696_딱지놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;
		// 총 라운드 수
		int N = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= N; testcase++) {
			// 4:별, 3:원, 2:네모, 1:세모
			// A입력
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int[] arrA = new int[4];
			for (int i = 0; i < A; i++) {
				arrA[Integer.parseInt(st.nextToken())-1]++;
			}
			// B입력
			st = new StringTokenizer(br.readLine(), " ");
			int B = Integer.parseInt(st.nextToken());
			int[] arrB = new int[4];
			for (int i = 0; i < B; i++) {
				arrB[Integer.parseInt(st.nextToken())-1]++;
			}
			// 값 비교
			int count = 0;
			for(int i = 3; i >= 0; i--) {
				if(arrA[i] > arrB[i]) {
					str.append("A").append("\n");
					break;
				}else if (arrA[i] < arrB[i]) {
					str.append("B").append("\n");
					break;
				}else
					count++;
			}
			if(count == 4)
				str.append("D").append("\n");
		}
		System.out.println(str);
		br.close();
	}
}
