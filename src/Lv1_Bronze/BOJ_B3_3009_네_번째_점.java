package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 기하학
 * https://www.acmicpc.net/problem/3009
 */
public class BOJ_B3_3009_네_번째_점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 3개의 점
		int[] arr_x = new int[3]; 
		int[] arr_y = new int[3];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr_x[i] = Integer.parseInt(st.nextToken());
			arr_y[i] = Integer.parseInt(st.nextToken());
		}
		// 나머지 1개의 점
		int x=0, y=0;
		for (int i = 0; i < 3; i++) {
			if(arr_x[i] == arr_x[(i+1)%3])
				x = arr_x[(i+2)%3];
			if(arr_y[i] == arr_y[(i+1)%3])
				y = arr_y[(i+2)%3];
		}
		// 결과 값 출력
		System.out.println(x + " " + y);
		br.close();
	}
}
