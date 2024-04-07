package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/26545
 */
public class BOJ_B5_26545_Mathematics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int n = 0; n < N; n++){
            result += Integer.parseInt(br.readLine());
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
