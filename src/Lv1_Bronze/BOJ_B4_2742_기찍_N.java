package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2742
 */
public class BOJ_B4_2742_기찍_N {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = N; n > 0; n--)
            str.append(n).append("\n");

        System.out.print(str);
        br.close();
    }
}
