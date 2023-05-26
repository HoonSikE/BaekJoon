package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/11053
 */
public class BOJ_S2_11053_가장_긴_증가하는_부분_수열 {
    static int[] A;
    // Integer로 만들면 초기값 = null
    static Integer[] dp;
    /** 최장 증가 부분 수열(LIS) */
    public static int LIS(int num){
        // 탐색하지 않은 위치라면
        if(dp[num] == null){
            // 최소 길이 1로 초기화
            dp[num] = 1;
            for(int n = num-1; n >= 0; n--) {
                if(A[n] < A[num])
                    dp[num] = Math.max(dp[num], LIS(n) + 1);
            }
        }
        return dp[num];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        dp = new Integer[N];

        // 배열 A
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++)
            A[n] = Integer.parseInt(st.nextToken());

        // 탐색
        for(int n = 0; n < N; n++)
            LIS(n);

        int max = dp[0];
        // 최댓값
        for(int n = 1; n < N; n++)
            max = Math.max(max, dp[n]);

        str.append(max);

        System.out.print(str);
        br.close();
    }
}
