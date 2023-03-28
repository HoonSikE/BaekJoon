package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산, 시뮬레이션
 * https://www.acmicpc.net/problem/24265
 */
public class BOJ_B3_24265_알고리즘_수업_알고리즘의_수행_시간_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        // for문은 (n^2-n)/2번 돈다.
        str.append(N*(N-1)/2).append("\n");
        // 다항식 : (n^2-n)/2
        str.append(2).append("\n");

        System.out.print(str);
        br.close();
    }
}
