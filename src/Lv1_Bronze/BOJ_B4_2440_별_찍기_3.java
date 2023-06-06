package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2440
 */
public class BOJ_B4_2440_별_찍기_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = N; n > 0; n--){
            for(int i = 0; i < n; i++)
                str.append("*");
            str.append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
