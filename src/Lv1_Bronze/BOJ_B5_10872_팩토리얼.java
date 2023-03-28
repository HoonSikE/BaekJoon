package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 조합론
 * https://www.acmicpc.net/problem/10872
 */
public class BOJ_B5_10872_팩토리얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int result = 1;

        for (int n = 1; n <= N; n++)
            result *= n;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
