package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 자료 구조, 큐
 * https://www.acmicpc.net/problem/11866
 *
 * stack 명령어
 * push(), peek(), pop(), empty()
 *
 * queue 명령어
 * add(), offer(), peek(), poll(), isEmpty(), get()
 */
public class BOJ_S5_11866_요세푸스_문제_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: N명의 사람
        int N = Integer.parseInt(st.nextToken());
        // K 번째 사람 제거
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            queue.offer(i);

        str.append("<");

        while(!queue.isEmpty()){
            for(int i = 1; i < K; i++)
                queue.offer(queue.poll());

            str.append(queue.poll());

            if(queue.size() > 0)
                str.append(", ");
        }

        str.append(">");

        System.out.print(str);
        br.close();
    }
}
