package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/**
 * @author HanHoon
 * @category 자료구조, 스택
 * https://www.acmicpc.net/problem/15815
 */
public class BOJ_S4_15815_천재_수학자_성필 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>(); 
		char[] arr = br.readLine().toCharArray();
		for (char c : arr) {
			if('0' <= c && c <= '9') {
				stack.push(c - '0');
			}else {
				int b = stack.pop();
				int a = stack.pop();
				switch(c) {
					case '*':
						stack.push(a*b);
						break;
					case '/':
						stack.push(a/b);
						break;
					case '+':
						stack.push(a+b);
						break;
					case '-':
						stack.push(a-b);
						break;
				}
			}
		}
		System.out.println(stack.pop());
		
		br.close();
	}
}
