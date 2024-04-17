package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/27331
 */
public class BOJ_B5_27331_Two_digit_Integer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String A = br.readLine();
        String B = br.readLine();


        str.append(Integer.parseInt(A+B));

        System.out.print(str);
        br.close();
    }
}
