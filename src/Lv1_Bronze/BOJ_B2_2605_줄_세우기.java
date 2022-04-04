package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 자료 구조, 연결 리스트
 * https://www.acmicpc.net/problem/2605
 */
public class BOJ_B2_2605_줄_세우기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		
		StringTokenizer st = null;
		// T : 학생의 수
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		// 자신의자리(tc) - 앞으로 이동(입력값)에 값을 넣어줌
		for (int tc = 0; tc < T; tc++) {
			list.add(tc-Integer.parseInt(st.nextToken()),(tc+1));
		}
		for (int i : list) {
			System.out.print(i + " ");
		}
		br.close();
	}
}
