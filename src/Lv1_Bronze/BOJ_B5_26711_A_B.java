package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/26711
 */
public class BOJ_B5_26711_A_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        str.append(A.add(B));

        System.out.print(str);
        br.close();
    }
}
