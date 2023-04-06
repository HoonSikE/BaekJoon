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
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            Integer.parseInt(br.readLine());
        }
        System.out.print(str);
        br.close();
    }
}
