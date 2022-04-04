package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_17478_재귀함수가_뭔가요 {
	
	public static void recursive(int num, String under_bar) {
		System.out.println(under_bar + "\"재귀함수가 뭔가요?\"");
		if(num == 0) {
			System.out.println(under_bar + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
		}else {
			System.out.println(under_bar + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			System.out.println(under_bar + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			System.out.println(under_bar + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			recursive(--num, under_bar + "____");
		}
		System.out.println(under_bar + "라고 답변하였지.");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursive(N, "");
	}
}

/*

[입력]
1

[출력]
** Recursive Call **
1
2
3
4
____1
____5
____6
6


2
** Recursive Call **
1
2
3
4
____1
____2
____3
____4
________1
________5
________6
____6
6

public class Solution {
	static String underBar = "";
	static String sArr[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("** Recursive Call **");
		sArr = new String[6];
		sArr[0] = "1";
		sArr[1] = "2";
		sArr[2] = "3";
		sArr[3] = "4";
		sArr[4] = "5";
		sArr[5] = "6";
		recursive(N);
	}
	
	private static void recursive(int num) {
		String temp=underBar;
		
		if(num == 0) {
			System.out.println(temp + sArr[0]);
			System.out.println(temp + sArr[4]);
			System.out.println(temp + sArr[5]);
			return;
		}
		// 재귀호출 하면서 반복되는 4개의 문장
		for(int i = 0; i<4; i++) {
			System.out.println(temp + sArr[i]);
		}
		
		underBar += "____";
		recursive(num-1);
		System.out.println(temp + sArr[5]);
	}
}
*/