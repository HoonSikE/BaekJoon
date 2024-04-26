package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/28701
 */
public class BOJ_B5_28701_세제곱의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        long sum1 = 0;
        long sum2 = 0;

        for (int n = 1; n <= N; n++){
            sum1 += n;
            sum2 += n*n*n;
        }

        str.append(sum1).append("\n");
        str.append(sum1*sum1).append("\n");
        str.append(sum2);

        System.out.print(str);
        br.close();
    }
}
