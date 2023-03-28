package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2444
 */
public class BOJ_B3_2444_별_찍기_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 1; n <= N; n++){
            for (int i = 0; i < N-n; i++)
                str.append(" ");
            for (int j = 0; j < 2*n-1; j++)
                str.append("*");
            str.append("\n");
        }

        for (int n = N-1; n >= 0; n--){
            for (int i = 0; i < N-n; i++)
                str.append(" ");
            for (int j = 0; j < 2*n-1; j++)
                str.append("*");
            str.append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
