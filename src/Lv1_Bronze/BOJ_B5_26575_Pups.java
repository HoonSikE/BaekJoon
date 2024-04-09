package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/26575
 */
public class BOJ_B5_26575_Pups {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double p = Double.parseDouble(st.nextToken());

            System.out.printf("$%.2f\n", Math.round(d*f*p*100)/100.0);
        }
        br.close();
    }
}