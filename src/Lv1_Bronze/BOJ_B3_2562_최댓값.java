package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2562
 */
public class BOJ_B3_2562_최댓값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();

		// 최댓값
		int max = Integer.MIN_VALUE;
		// 몇번째 수
		int index = 0;
		// 9개의 수
		for (int i = 1; i <= 9; i++){
			int tmp = Integer.parseInt(br.readLine());
			if(max < tmp){
				max = tmp;
				index = i;
			}
		}

		str.append(max).append("\n").append(index);

		System.out.print(str);
		br.close();
	}
}
