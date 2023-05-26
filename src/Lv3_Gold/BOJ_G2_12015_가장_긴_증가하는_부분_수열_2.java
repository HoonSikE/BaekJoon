package Lv3_Gold;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 이분 탐색, 가장 긴 증가하는 부분 수열: o(n log n)
 * https://www.acmicpc.net/problem/12015
 */
public class BOJ_G2_12015_가장_긴_증가하는_부분_수열_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 수열 A의 크기
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            A[n] = Integer.parseInt(st.nextToken());
        }

        System.out.print(str);
        br.close();
    }
}
