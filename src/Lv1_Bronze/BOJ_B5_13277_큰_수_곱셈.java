package Lv1_Bronze;

import java.io.*;
import java.math.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/13277
 */
public class BOJ_B5_13277_큰_수_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        str.append(new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken())));

        System.out.print(str);
        br.close();
    }
}
