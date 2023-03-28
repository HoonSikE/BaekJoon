package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/24266
 */
public class BOJ_B3_24266_알고리즘_수업_알고리즘의_수행_시간_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        Long N = Long.parseLong(br.readLine());

        // for문은 n*n*n번 돈다.
        str.append(N*N*N).append("\n");
        // 다항식 : n^3
        str.append(3).append("\n");

        System.out.print(str);
        br.close();
    }
}
