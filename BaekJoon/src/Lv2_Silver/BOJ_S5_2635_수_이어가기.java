package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2635
 */
public class BOJ_S5_2635_수_이어가기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫번째 수
		int N = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> result = new ArrayList<Integer>();
		// N/2 미만 : count = 3, N/2 : count = 5
		for (int i = N/2; i <= N; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(N);
			list.add(i);
			int n = 1;
			while(true) {
				// 뺸수가 음수라면 break;
				if(list.get(n-1) - list.get(n) < 0)	break;
				list.add(list.get(n-1) - list.get(n));
				n++;
			}
			if(max < list.size()) {
				max = list.size();
				result = list;
			}
		}
		System.out.println(max);
		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
		br.close();
	}
}
