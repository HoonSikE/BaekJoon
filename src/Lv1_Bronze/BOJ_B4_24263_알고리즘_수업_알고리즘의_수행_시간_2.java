package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/24267
 */
public class BOJ_B4_24263_알고리즘_수업_알고리즘의_수행_시간_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        // for문은 n번 돈다.
        str.append(N).append("\n");
        // 다항식 : n
        str.append(1).append("\n");

        System.out.print(str);
        br.close();
    }
}
