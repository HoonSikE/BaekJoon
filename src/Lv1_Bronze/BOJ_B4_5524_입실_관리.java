package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 문자열
 * https://www.acmicpc.net/problem/5524
 */
public class BOJ_B4_5524_입실_관리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            str.append(br.readLine().toLowerCase()).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
