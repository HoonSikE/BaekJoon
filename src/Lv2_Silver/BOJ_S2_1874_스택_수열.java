package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 스택
 * https://www.acmicpc.net/problem/1874
 */
public class BOJ_S2_1874_스택_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int start = 0;

        for (int n = 0; n < N; n++){
            int value = Integer.parseInt(br.readLine());

            if(value > start){
                for(int i = start + 1; i <= value; i++){
                    stack.push(i);
                    str.append("+\n");
                }
                start = value;
            }else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            str.append("-\n");
        }
        System.out.print(str);
        br.close();
    }
}
