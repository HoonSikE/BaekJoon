package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 큐
 * https://www.acmicpc.net/problem/2164
 */
public class BOJ_S4_2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for (int n = 1; n <= N; n++)
            queue.offer(n);

        while(queue.size() > 1){
            // 우선, 제일 위에 있는 카드를 바닥에 버린다.
            queue.poll();
            // 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옯긴다.
            queue.offer(queue.poll());
        }

        str.append(queue.poll());

        System.out.print(str);
        br.close();
    }
}
