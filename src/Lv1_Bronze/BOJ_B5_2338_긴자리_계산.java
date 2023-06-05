package Lv1_Bronze;

import java.io.*;
import java.math.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도, 큰 수 연산
 * https://www.acmicpc.net/problem/2338
 */
public class BOJ_B5_2338_긴자리_계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        /**
         * BigInteger
         * 덧셈: add
         * 뺄셈: subtract
         * 곱셈: multiply
         * 나눗셈: divide
         * 나머지: remainder
         */
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        str.append(A.add(B)).append("\n");
        str.append(A.subtract(B)).append("\n");
        str.append(A.multiply(B)).append("\n");

        System.out.print(str);
        br.close();
    }
}
