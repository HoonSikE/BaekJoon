package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/24082
 */
public class BOJ_B5_24082_Cube {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        long N = Long.parseLong(br.readLine());

        str.append(N*N*N);

        System.out.print(str);
        br.close();
    }
}
