package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/2775
 */
public class BOJ_B1_2775_부녀회장이_될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        // k층 n호에는 몇명이 살고 있는지?
        for (int i = 1; i <= T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
        }

        str.append("");

        System.out.print(str);
        br.close();
    }
}
