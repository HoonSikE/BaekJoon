package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 사칙연산, 애드 훅
 * https://www.acmicpc.net/problem/10158
 */
public class BOJ_S4_10158_개미 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// W: 가로길이, H:세로길이
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		// 초기위치 P,Q
		st = new StringTokenizer(br.readLine(), " ");
		int P = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		// T: 개미가 움직일 시간(단위시간 1시간)
		int T = Integer.parseInt(br.readLine());
		int y = Q+T;
		if(y%(2*H) <= H)
			y = y%(2*H);
		else
			y = 2*H - y%(2*H);
		
		int x = P+T;
		if(x%(2*W) <= W)
			x = x%(2*W);
		else
			x = 2*W - x%(2*W);
		System.out.println(x + " " + y);
		br.close();
	}
}
