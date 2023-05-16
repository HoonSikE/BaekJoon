package Lv1_Bronze;

import java.io.*;
import java.util.*;
import java.math.*;

/**
 * @author HanHoon
 * @category .
 * https://www.acmicpc.net/problem/15829
 */
public class BOJ_B2_15829_Hashing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // L
        int L = Integer.parseInt(br.readLine());
        String S = br.readLine();
        BigInteger result = new BigInteger("0");

        for (int i = 0; i < L; i++) {
            result = result.add(BigInteger.valueOf(S.charAt(i) - 96)
                    .multiply(BigInteger.valueOf(31).pow(i)));
        }

        str.append(result.remainder(BigInteger.valueOf(1234567891)));

        System.out.print(str);
        br.close();
    }
}
