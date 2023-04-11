package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 문자열, 스택
 * https://www.acmicpc.net/problem/4949
 */
public class BOJ_S4_4949_균형잡힌_세상 {
    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[')
                stack.push(c);
            else if(c == ')') {
                if(stack.isEmpty())
                    return "no";
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return "no";
            } else if(c == ']') {
                if(stack.isEmpty())
                    return "no";
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    return "no";
            }
        }

        if(stack.isEmpty())
            return "yes";
        else
            return "no";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            String s = br.readLine();
            if(s.charAt(0) == '.')
                break;

            str.append(solve(s)).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
