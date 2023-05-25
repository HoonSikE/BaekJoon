package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 다이나믹 프로그래밍, 조합론
 * https://www.acmicpc.net/problem/1010
 */
public class BOJ_S5_1010_다리_놓기 {
    static int[][] dp = new int[30][30];

    public static int comination(int n, int r){
        // 이미 계산된 것
        if(dp[n][r] > 0)
            return dp[n][r];

        /**
         * 서쪽 사이트 개수 = 동쪽 사이트 개수
         * 다리 개수 = 0
         * 이면 경우의 수 1
         */
        if(n == r || r == 0)
            return dp[n][r] = 1;

        // 선택한 경우 + 선택하지 않은 경우
        return dp[n][r] = comination(n-1, r-1) + comination(n-1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            str.append(comination(M, N)).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
