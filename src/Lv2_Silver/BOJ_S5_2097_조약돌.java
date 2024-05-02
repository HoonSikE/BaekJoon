package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2097
 */
public class BOJ_S5_2097_조약돌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            Integer.parseInt(br.readLine());
        }
        System.out.print(str);
        br.close();
    }
}
