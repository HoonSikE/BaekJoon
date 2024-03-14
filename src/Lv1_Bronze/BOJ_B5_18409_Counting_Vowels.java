package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/18409
 */
public class BOJ_B5_18409_Counting_Vowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        str.append(S.length()
                - S.replace("a", "").replace("i", "")
                .replace("u", "").replace("e", "")
                .replace("o", "").length());

        System.out.print(str);
        br.close();
    }
}
