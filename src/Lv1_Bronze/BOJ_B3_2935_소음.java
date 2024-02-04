package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;

/**
 * @author HanHoon
 * @category 수학, 문자열, 사칙연산
 * https://www.acmicpc.net/problem/2935
 */
public class BOJ_B3_2935_소음 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        BigInteger A = new BigInteger(br.readLine());
        String S = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        if(S.equals("*")){
            str.append(A.multiply(B));
        }else if(S.equals("+")){
            str.append(A.add(B));
        }

        System.out.print(str);
        br.close();
    }
}
