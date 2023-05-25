package Lv1_Bronze;

import java.io.*;
import java.util.*;
import java.math.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/1272
 */
public class BOJ_B5_1271_엄청난_부자2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        // divide: 나누기, remainder: 나머지
        str.append(n.divide(m) + "\n" + n.remainder(m));

        System.out.print(str);
        br.close();
    }
}
