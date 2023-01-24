package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2438
 */
public class BOJ_B5_별_찍기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        // N
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++){
            for (int j = 0; j < i; j++)
                str.append("*");
            str.append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
