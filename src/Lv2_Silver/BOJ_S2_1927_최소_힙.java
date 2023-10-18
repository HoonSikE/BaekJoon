package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 우선순위 큐
 * https://www.acmicpc.net/problem/1927
 */
public class BOJ_S2_1927_최소_힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N: 연산의 개수
        int N = Integer.parseInt(br.readLine());
        /**
         * 우선순위 큐: 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나오는 것을 의미
         * 힙을 가지고 구현할 수 있다.
         * 값 추가: add, offer
         * 값 삭제: poll, remove, clear
         * 값 출력: poll, peek
         */
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int n = 0; n < N; n++){
            // 연산에 대한 정보 (자연수: 입력, 0: 가장 작은 값 출력 및 제거)
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(queue.isEmpty())
                    str.append(0).append("\n");
                else
                    str.append(queue.poll()).append("\n");
            }else{
                queue.add(x);
            }
        }
        System.out.print(str);
        br.close();
    }
}
