package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 정수론, 소수 판정, 에라토스테네스의 체
 * https://www.acmicpc.net/problem/1990
 */
public class BOJ_G5_1990_소수인팰린드롬 {
	public static boolean isPalindrome(int num) {
		String tmp = num + "";
		for (int j = 0; j < tmp.length()/2; j++)
			if(tmp.charAt(j) != tmp.charAt(tmp.length()-1-j))
				return false;
		
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 두 정수 A, B
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[100000001];
		ArrayList<Integer> list = new ArrayList<>();
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i <= B; i++)
			if(!arr[i]) {
				if(i>=A) list.add(i);
				for (int j = i+i; j <= B; j+=i)
					arr[j] = true;
			}
		
		StringBuilder str = new StringBuilder();
		for (Integer prime : list)
			if(isPalindrome(prime))
				str.append(prime).append("\n");
		
		str.append(-1);
		System.out.println(str);
		br.close();
	}
}
