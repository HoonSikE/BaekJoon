package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 문자열, 스택
 * https://www.acmicpc.net/problem/9012
 */
public class BOJ_S4_9012_괄호 {
    public static String parenthesis(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 여는 괄호는 스택에 넣는다.
            if(c == '(')
                stack.push(str.charAt(i));
                // 닫는 괄호일 경우
            else if(c == ')')
                // 스택이 비어있을 경우 NO
                if(stack.isEmpty())
                    return "NO";
                // )라면 push
                else if(stack.peek() == ')')
                    stack.push(c);
                // (라면 pop
                else
                    stack.pop();
        }

        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // T: 입력 데이터의 수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            String s = br.readLine();
            str.append(parenthesis(s)).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
