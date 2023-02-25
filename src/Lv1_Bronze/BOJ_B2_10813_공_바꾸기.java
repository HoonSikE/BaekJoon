package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/10813
 */
public class BOJ_B2_10813_공_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N개의 바구니
        int N = Integer.parseInt(st.nextToken());
        // M번 공을 바꿈
        int M = Integer.parseInt(st.nextToken());

        int[] ball = new int[N+1];

        for(int i = 1; i <= N; i++)
            ball[i] = i;

        for (int n = 0; n < M; n++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int tmp = ball[a];
            ball[a] = ball[b];
            ball[b] = tmp;
        }

        for(int i = 1; i <= N; i++)
            str.append(ball[i]).append(" ");

        System.out.print(str);
        br.close();
    }
}
