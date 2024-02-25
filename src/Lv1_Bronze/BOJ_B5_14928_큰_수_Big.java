package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/14928
 */
public class BOJ_B5_14928_큰_수_Big {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        str.append(new BigInteger(br.readLine()).mod(new BigInteger("20000303")));

        System.out.print(str);
        br.close();
    }
}
