package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/10757
 */
public class BOJ_B5_10757_큰_수_A_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;
        StringBuilder str = new StringBuilder();

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        str.append(A.add(B));

        System.out.print(str);
        br.close();
    }
}
