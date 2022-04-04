package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S3_9095_123_더하기 {
	static int N, sum = 0, cnt = 0; 
	public static void backtracking(int one, int two, int three) {
		sum = 1*one + 2*two + 3*three;
		if(sum > N) return;
		if(sum == N) {
			cnt++;
			return;
		}
		backtracking(one+1, two, three);
		backtracking(one, two+1, three);
		backtracking(one, two, three+1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		
		// 테스트 케이스 개수 T
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			// 정수 N
			N = Integer.parseInt(br.readLine());
			backtracking(0,0,0);
			str.append(cnt+"\n");
			cnt = 0;
		}
		System.out.println(str.toString());
		br.close();
	}
}
