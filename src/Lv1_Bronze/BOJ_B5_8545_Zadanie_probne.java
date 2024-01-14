package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/8545
 */
public class BOJ_B5_8545_Zadanie_probne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        str.append(new StringBuffer(br.readLine()).reverse().toString());

        System.out.print(str);
        br.close();
    }
}
