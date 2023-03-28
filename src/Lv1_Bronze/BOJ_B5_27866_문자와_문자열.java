package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/27866
 */
public class BOJ_B5_27866_문자와_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // S: 단어
        String S = br.readLine();
        // i번째 글자
        int i = Integer.parseInt(br.readLine());

        str.append(S.charAt(i-1));

        System.out.print(str);
        br.close();
    }
}
