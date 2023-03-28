package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/10810
 */
public class BOJ_B2_10810_공_넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 바구니의 개수
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        // M: 공을 넣는 횟수
        int M = Integer.parseInt(st.nextToken());

        for (int n = 0; n < M; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int t = i-1; t < j; t++)
                arr[t] = k;
        }

        for(int num : arr)
            str.append(num + " ");

        System.out.print(str);
        br.close();
    }
}
