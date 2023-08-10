package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2010
 */
public class BOJ_B3_2010_플러그 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        long answer = 1;

        for (int n = 0; n < N; n++)
            answer += Integer.parseInt(br.readLine()) - 1;

        str.append(answer);

        System.out.print(str);
        br.close();
    }
}
