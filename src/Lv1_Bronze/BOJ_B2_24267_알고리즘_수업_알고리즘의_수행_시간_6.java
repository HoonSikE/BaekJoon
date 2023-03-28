package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/24267
 */
public class BOJ_B2_24267_알고리즘_수업_알고리즘의_수행_시간_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        Long N = Long.parseLong(br.readLine());

        // for문은 n*(n-1)*(n-2)번 돈다.
        str.append(N*(N-1)*(N-2)/6).append("\n");
        // 다항식 : n*(n-1)*(n-2)/6
        str.append(3).append("\n");

        System.out.print(str);
        br.close();
    }
}
