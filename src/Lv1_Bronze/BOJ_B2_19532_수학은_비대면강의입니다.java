package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/19532
 */
public class BOJ_B2_19532_수학은_비대면강의입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // a, b, c, d, e, f
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());


        System.out.print(str);
        br.close();
    }
}
