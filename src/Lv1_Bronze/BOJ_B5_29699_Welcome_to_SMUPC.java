package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열, 사칙연산
 * https://www.acmicpc.net/problem/29699
 */
public class BOJ_B5_29699_Welcome_to_SMUPC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = (Integer.parseInt(br.readLine())-1)%14;

        str.append("WelcomeToSMUPC".charAt(N));

        System.out.print(str);
        br.close();
    }
}
