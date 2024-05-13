package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 기하학, 사칙연산
 * https://www.acmicpc.net/problem/29751
 */
public class BOJ_B5_29751_삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        System.out.printf("%.1f", W*H/2.0);

        br.close();
    }
}
