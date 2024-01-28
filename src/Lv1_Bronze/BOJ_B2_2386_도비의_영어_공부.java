package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2386
 */
public class BOJ_B2_2386_도비의_영어_공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while (true){
            String s = br.readLine();

            if(s.equals("#"))
                break;

            String a = s.substring(0, 1);
            String b = s.substring(2);
            String tmp = b.replace(a, "").replace(String.valueOf((char)(a.charAt(0)-'a'+'A')), "");

            str.append(a).append(" ").append(b.length() - tmp.length()).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
