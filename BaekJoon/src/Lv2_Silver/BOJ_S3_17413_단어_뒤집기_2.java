package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * @author HanHoon
 * @category 구현, 자료 구조, 문자열, 스택
 * https://www.acmicpc.net/problem/17413
 */
public class BOJ_S3_17413_단어_뒤집기_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 문자열에 공백(' ')도 그대로 다 넣어준다.
		char[] list = br.readLine().toCharArray();
		Queue<Character> queue = new LinkedList<Character>();
		Stack<Character> stack = new Stack<>();

		boolean protect = false;
		for (int i = 0; i < list.length; i++) {
			// '<'를 만난다면 비보호 문자열을 역출력해주고 보호모드로 전환
			if(list[i] == '<') {
				while(!stack.empty()) str.append(stack.pop());
				protect = true;
			// '>'를 만난다면 보호문자를 출력해주고 비보호모드로 전환, 중복출력이 되지 않게 continue;
			}else if(list[i] == '>') {
				// 괄호포함 안의 내용 출력
				while(!queue.isEmpty()) str.append(queue.poll());
				str.append(list[i]);
				protect = false;
				continue;
			// 비보호 구역에서 공백을 만난다면 따로 역출력될 수 있도록 구분시켜 준다.
			}else if(list[i] == ' ' && !protect) {
				while(!stack.empty()) str.append(stack.pop());
				str.append(list[i]);
				continue;
			}
			// 보호중일 때는 queue에 저장
			if(protect)
				queue.add(list[i]);
			// 보호중이지 않을 때는 stack에 저장
			if(!protect)
				stack.push(list[i]);
		}
		// '<'를 만나지 못해 출력되지 않은 stack이 있다면 마저 출력
		while(!stack.empty()) str.append(stack.pop());
		
		System.out.println(str.toString());
		br.close();
	}
}
