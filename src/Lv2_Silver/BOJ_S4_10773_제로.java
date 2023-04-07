package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 자료 구조, 스택
 * https://www.acmicpc.net/problem/10773
 */
public class BOJ_S4_10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // K : K개의 정수
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int k = 0; k < K; k++){
            int num = Integer.parseInt(br.readLine());

            if(num != 0)
                stack.push(num);
            else
                stack.pop();
        }

        for(int num : stack)
            result += num;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
