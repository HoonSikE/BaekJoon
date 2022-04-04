package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/10448
 */
public class BOJ_B2_10448_유레카_이론 {
	static int K, tmp[];
	static boolean flag;
	static ArrayList<Integer> list;
	public static void combination(int result, int count, int start) {
		if(count == 3) {
			if(result == K)
				flag = true;
			return;
		}
		for (int i = start; i < list.size(); i++) {
			tmp[count] = i;
			combination(result+list.get(i), count+1, i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 1~1000의 삼각형 경우의 수
		list = new ArrayList<>();
		for (int i = 1; i*(i+1)/2 <= 1000; i++) {
			list.add(i*(i+1)/2);
		}
		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= T; testcase++) {
			K = Integer.parseInt(br.readLine());
			flag = false;
			tmp = new int[3];
			combination(0, 0, 0);
			if(flag)
				str.append(1).append("\n");
			else
				str.append(0).append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}
