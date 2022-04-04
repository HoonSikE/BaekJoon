package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S3_10974_모든_순열 {
	static StringBuilder str = new StringBuilder();
	public static void combination(int N, int[] result, boolean[] isSelected, int count) {
		if(count == N) {
			for (int i = 0; i < N; i++) {
				str.append(result[i] + " ");
			}
			str.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if(isSelected[i]) continue;
			isSelected[i] = true;
			result[count] = i + 1;
			combination(N, result, isSelected, count+1);
			isSelected[i] = false;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 숫자 1~N의 순열
		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N];
		boolean[] isSelected = new boolean[N];
		combination(N, result, isSelected, 0);
		System.out.println(str);
		br.close();
	}
}
