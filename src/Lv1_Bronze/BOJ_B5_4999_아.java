package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/4999
 */
public class BOJ_B5_4999_아 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S1 = br.readLine();
        String S2 = br.readLine();

        str.append(S1.length() >= S2.length() ? "go" : "no");

        System.out.print(str);
        br.close();
    }
}
