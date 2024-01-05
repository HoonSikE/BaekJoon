package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author HanHoon
 * @category 수학, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/2052
 */
public class BOJ_B2_2052_지수연산 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        N = Integer.parseInt(br.readLine());

        str.append(Math.pow(0.5, N));

        System.out.print(str);
        br.close();
    }
}
