package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 큐
 * https://www.acmicpc.net/problem/18258
 *
 * stack 명령어
 * push(), peek(), pop(), empty()
 *
 * queue 명령어
 * add(), offer(), peek(), poll(), isEmpty(), get()
 */
public class BOJ_S4_18258_큐_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 주어지는 명령의 수
        int N = Integer.parseInt(br.readLine());

        // Queue
        LinkedList<Integer> queue = new LinkedList<>();

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num = 0;

            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            switch(cmd){
                case "push":
                    queue.offer(num);
                    break;
                case "pop":
                    if(queue.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(queue.poll()).append("\n");
                    break;
                case "size":
                    str.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        str.append(1).append("\n");
                    else
                        str.append(0).append("\n");
                    break;
                case "front":
                    if(queue.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(queue.get(0)).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(queue.get(queue.size()-1)).append("\n");
                    break;
            }
        }

        System.out.print(str);
        br.close();
    }
}
