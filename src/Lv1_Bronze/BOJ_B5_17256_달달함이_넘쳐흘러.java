package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/17256
 */
public class BOJ_B5_17256_달달함이_넘쳐흘러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        int N = 2;
        int[][] arr = new int[2][3];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            arr[n][0] = Integer.parseInt(st.nextToken());
            arr[n][1] = Integer.parseInt(st.nextToken());
            arr[n][2] = Integer.parseInt(st.nextToken());
        }
        /**
         * cx = az + bx -> bx = cx - az
         * cy = ay * by -> by = cy / ay
         * cz = ax + bz -> bz = cz - ax
         */
        str.append(arr[1][0]-arr[0][2]).append(" ")
                .append(arr[1][1]/arr[0][1]).append(" ")
                .append(arr[1][2]-arr[0][0]);

        System.out.print(str);
        br.close();
    }
}
