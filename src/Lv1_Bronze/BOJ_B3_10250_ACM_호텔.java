package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/10250
 */
public class BOJ_B3_10250_ACM_호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        // k층 n호에는 몇명이 살고 있는지?
        for (int i = 1; i <= T; i++){
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            str.append("");
        }

        System.out.print(str);
        br.close();
    }
}

//            if(N % H == 0) {
//                System.out.println((H * 100) + (N / H));
//
//            } else {
//                System.out.println(((N % H) * 100) + ((N / H) + 1));
//            }
