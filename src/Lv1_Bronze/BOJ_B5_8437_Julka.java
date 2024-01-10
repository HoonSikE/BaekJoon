package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/8437
 */
public class BOJ_B5_8437_Julka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        BigInteger n1 = new BigInteger(br.readLine());
        BigInteger n2 = new BigInteger(br.readLine());

        str.append((n1.subtract(n2)).divide(new BigInteger("2")).add(n2)).append("\n");
        str.append((n1.subtract(n2)).divide(new BigInteger("2")));

        System.out.print(str);
        br.close();
    }
}
