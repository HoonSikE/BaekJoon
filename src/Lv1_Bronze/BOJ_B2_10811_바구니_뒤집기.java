package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/10811
 */
public class BOJ_B2_10811_바구니_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N개의 바구니
        int N = Integer.parseInt(st.nextToken());
        // M개의 바구니의 순서를 역순으로 만드는 방법
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        for(int i = 1; i <= N; i++)
            arr[i] = i;

        for (int n = 0; n < M; n++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }

        for(int i = 1; i <= N; i++)
            str.append(arr[i]).append(" ");

        System.out.print(str);
        br.close();
    }
}
