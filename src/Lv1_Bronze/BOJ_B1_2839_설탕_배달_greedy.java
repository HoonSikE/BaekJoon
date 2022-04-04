package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 수학, 다이나믹 프로그래밍, 그리디 알고리즘
 * https://www.acmicpc.net/problem/2839
 */
public class BOJ_B1_2839_설탕_배달_greedy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 배달할 설탕 Nkg
		int N = Integer.parseInt(br.readLine());
		// 설탕은 3kg, 5kg 2가지가 있다
		// 4kg, 7kg은 가져갈 수 없음.
		if(N==4||N==7)
			System.out.println(-1);
		// 5로 나눠진다면 5kg로 다 가져가면 됨.
		else if(N%5 == 0)
			System.out.println(N/5);
		// 나머지가 1이라면 6kg(3kg*2)가 2개이므로 결국 +1
		// 나머지가 3이라면 8kg(5kg*1, 3kg*1)로 결국 +1
		else if(N%5 == 1 || N%5 == 3)
			System.out.println(N/5 +1);
		// 나머지가 2이라면 10kg+2kg = 12kg(3kg*4)가 2개이므로 결국 +2
		// 나머지가 4이라면 9kg (3kg*3)로 결국 +2
		else if(N%5 == 2 || N%5 == 4)
			System.out.println(N/5+2);
		br.close();
	}
}
