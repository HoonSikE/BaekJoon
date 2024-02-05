package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/8871
 */
public class BOJ_B5_8871_Zadanie_probne_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        str.append((N+1)*2 + " " + (N+1)*3);

        System.out.print(str);
        br.close();
    }
}
