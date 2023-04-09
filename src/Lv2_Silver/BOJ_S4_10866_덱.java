package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 덱.
 * https://www.acmicpc.net/problem/10866
 *
 * deque 명령어
 * offerFirst, pollFirst
 * offerLast, pollLast
 * getFirst(), getLast()
 * size(), isEmpty()
 * indexOf : 특정 숫자 위치
 */
public class BOJ_S4_10866_덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N : 주어지는 명령의 수
        int N = Integer.parseInt(br.readLine());
        // 덱
        LinkedList<Integer> deque = new LinkedList<>();

        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            switch(operation){
                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(deque.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    if(deque.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(deque.pollLast()).append("\n");
                    break;
                case "size":
                    str.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty())
                        str.append(1).append("\n");
                    else
                        str.append(0).append("\n");
                    break;
                case "front":
                    if(deque.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(deque.getFirst()).append("\n");
                    break;
                case "back":
                    if(deque.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(deque.getLast()).append("\n");
                    break;
            }
        }

        System.out.print(str);
        br.close();
    }
}
