package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/24309
 */
public class BOJ_B5_24309_PABEHCTBO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());

        str.append(b.subtract(c).divide(a));

        System.out.print(str);
        br.close();
    }
}
