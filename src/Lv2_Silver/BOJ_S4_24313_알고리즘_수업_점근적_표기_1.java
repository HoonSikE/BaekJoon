package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/24313
 */
public class BOJ_S4_24313_알고리즘_수업_점근적_표기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        str.append((a1 * n0 + a0 <= c * n0) && c >= a1 ? 1:0);

        System.out.print(str);
        br.close();
    }
}
