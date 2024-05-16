package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/30030
 */
public class BOJ_B5_30030_스위트콘_가격_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int B = Integer.parseInt(br.readLine());

        str.append(B/11*10);

        System.out.print(str);
        br.close();
    }
}
