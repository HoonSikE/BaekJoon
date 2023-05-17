package Lv1_Bronze;

import java.io.*;
import java.math.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/24723
 */
public class BOJ_B4_24723_녹색거탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        str.append(BigInteger.valueOf(1).shiftLeft(N));

        System.out.print(str);
        br.close();
    }
}
