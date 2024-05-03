package Lv2_Silver;

import java.io.*;
import java.util.LinkedList;

/**
 * @author HanHoon
 * @category 구현, 자료 구조, 큐
 * https://www.acmicpc.net/problem/2161
 */
public class BOJ_S5_2161_카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        for(int n = 1; n <= N; n++){
            deque.add(n);
        }

        while(true){
            str.append(deque.pollFirst()).append(" ");

            if(!deque.isEmpty())
                deque.offerLast(deque.pollFirst());
            else
                break;
        }

        System.out.print(str);
        br.close();
    }
}
