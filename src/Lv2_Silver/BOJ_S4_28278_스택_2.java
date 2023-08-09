package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 스택
 * https://www.acmicpc.net/problem/28787
 */
public class BOJ_S4_28278_스택_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 명령어 개수
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());

            switch (M) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (stack.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(stack.pop()).append("\n");
                    break;
                case 3:
                    str.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty())
                        str.append(1).append("\n");
                    else
                        str.append(0).append("\n");
                    break;
                case 5:
                    if (stack.isEmpty())
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
