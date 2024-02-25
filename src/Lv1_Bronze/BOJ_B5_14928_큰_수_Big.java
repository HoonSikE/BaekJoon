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

        String N = br.readLine();
        long result = 0;

        for(int n = 0; n < N.length(); n++){
            result = (result*10 + (N.charAt(n) - '0')) % 20000303;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
