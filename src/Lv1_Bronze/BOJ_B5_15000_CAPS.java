package Lv1_Bronze;

import java.io.*;
import java.util.Locale;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/15000
 */
public class BOJ_B5_15000_CAPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String s = br.readLine();

        str.append(s.toUpperCase(Locale.ROOT));

        System.out.print(str);
        br.close();
    }
}
