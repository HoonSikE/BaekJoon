package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

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
		
		int [] result = new int[N];
		int [] tmp = AB[1];
		Arrays.sort(tmp);
		
		for(int cnt = N-1; cnt >= 0; cnt--) {
			for(int j = 0; j < N; j++) {
				if(AB[1][j] == tmp[cnt]) {
					result[j] = AB[0][N-1-cnt];
					break;
				}
			}
		}
		for (int i = 0; i < tmp.length; i++) {
			S += result[i] * AB[1][i];
		}
		System.out.println(S);
	}
}
