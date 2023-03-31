package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 스택
 * https://www.acmicpc.net/problem/10828
 *
 * stack 명령어
 * push(), peek(), pop(), empty()
 *
 * queue 명령어
 * add(), offer(), peek(), poll()
 */
public class BOJ_S4_10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 주여지는 명령 수
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num = 0;

            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            switch(cmd){
                case "push":
                    stack.push(num);
                    break;
                case "pop":
                    if(stack.empty())
                        str.append(-1).append("\n");
                    else
                        str.append(stack.pop()).append("\n");
                    break;
                case "size":
                    str.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.empty())
                        str.append(1).append("\n");
                    else
                        str.append(0).append("\n");
                    break;
                case "top":
                    if(stack.empty())
                        str.append(-1).append("\n");
                    else
                        str.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.print(str);
        br.close();
    }
}
