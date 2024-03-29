package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2743
 */
public class BOJ_B5_2743_단어_길이_재기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        str.append(br.readLine().length());

        System.out.print(str);
        br.close();
    }
}
