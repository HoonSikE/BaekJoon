package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 문자열, 재귀
 * https://www.acmicpc.net/problem/1769
 */
public class BOJ_S5_1769_3의_배수 {
	static int cnt = 0, Y = 0;
	public static void recur(String X) {
		if(X.length() >1) {
			for(int i = 0; i < X.length(); i++) {
				Y += X.charAt(i) - '0';
			}
			X = Y + "";
			Y = 0;
			recur(X);
			cnt++;
		}else {
			Y = Integer.parseInt(X);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		if(!(0<X.length()&&X.length()<=1000000)) {
			System.out.println("0~1,000,000 자리수 범위 초과");
			return;
		}
		recur(X);
		System.out.println(cnt);
		if(Y!=0 && Y%3==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
