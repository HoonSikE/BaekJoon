package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2355
 */
public class BOJ_B2_2355_시그마 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long N = Math.min(A, B);
        long M = Math.max(A, B);

        long sum = (N+M) * ((M-N+1)/2);

        if((M-N+1)%2 != 0){
            sum += (N + M) / 2;
        }

        str.append(sum);

        System.out.print(str);
        br.close();
    }
}
