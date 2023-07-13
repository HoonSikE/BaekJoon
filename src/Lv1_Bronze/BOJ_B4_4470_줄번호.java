package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/4470
 */
public class BOJ_B4_4470_줄번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int n = 1; n <= N; n++)
            str.append(n + ". " + br.readLine() + "\n");

        System.out.print(str);
        br.close();
    }
}
