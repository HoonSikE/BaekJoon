package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2961
 */
public class BOJ_S2_2961_도영이가_만든_맛있는_음식 {
	static int N, result = Integer.MAX_VALUE;
	static int SB[][];
	static boolean isSelected[];
	public static void backtracking(int index) {
		if(index == N) {
			int SMul = 1;
			int BSum = 0;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if(isSelected[i]) {
					cnt++;
					SMul *= SB[i][0];
					BSum += SB[i][1];
				}
			}
			if(cnt == 0) return;
			if(result > Math.abs(SMul-BSum))
				result = Math.abs(SMul-BSum);
			return;
		}
		isSelected[index] = true;
		backtracking(index+1);
		isSelected[index] = false;
		backtracking(index+1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 재료의 개수
		N = Integer.parseInt(br.readLine());
		// S : 신맛, B : 쓴맛
		SB = new int[N][2];
		isSelected = new boolean[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			SB[i][0] = Integer.parseInt(st.nextToken());
			SB[i][1] = Integer.parseInt(st.nextToken());
		}
		backtracking(0);
		System.out.println(result);
		
		br.close();
	}
}
