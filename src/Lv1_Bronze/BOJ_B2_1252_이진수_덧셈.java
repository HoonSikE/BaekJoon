package Lv1_Bronze;

import java.io.*;
import java.math.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/1252
 */
public class BOJ_B2_1252_이진수_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // BigInteger 형변환하면서 10진수로 바꿔줌
        BigInteger S1 = new BigInteger(s1, 2);
        BigInteger S2 = new BigInteger(s2, 2);

        BigInteger sum = S1.add(S2);

        // 2진수 변환
        str.append(sum.toString(2));

        System.out.print(str);
        br.close();
    }
}
