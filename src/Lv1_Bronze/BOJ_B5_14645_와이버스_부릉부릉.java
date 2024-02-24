package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/14645
 */
public class BOJ_B5_14645_와이버스_부릉부릉 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
        }

        str.append("비와이");

        System.out.print(str);
        br.close();
    }
}
