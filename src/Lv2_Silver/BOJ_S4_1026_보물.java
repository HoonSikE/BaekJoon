package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 그리디 알고리즘, 정렬
 * https://www.acmicpc.net/problem/1026
 */
public class BOJ_S4_1026_보물 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		int S = 0;
		int[][] AB = new int[2][N];
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				AB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(AB[0]);
		Arrays.sort(AB[1]);
		for (int i = 0; i < N; i++) {
			S += AB[0][i] * AB[1][N-1-i];
		}
		System.out.println(S);
	}
}
