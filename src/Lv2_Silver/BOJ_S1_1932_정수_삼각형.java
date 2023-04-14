package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/1932
 */
public class BOJ_S1_1932_정수_삼각형 {
    static int[][] arr;
    static int[][] dp;
    static int N;

    public static int find(int depth, int idx){
        // 마지막 행에서 dp값 반환
        if(depth == N - 1)
            return dp[depth][idx];

        // 탐색하지 않았을 때 양 쪽 값 비교
        if(dp[depth][idx] == 0)
            dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + arr[depth][idx];

        return dp[depth][idx];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 삼각형의 크기
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][N];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n+1; j++)
                arr[n][j] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++)
            dp[N-1][i] = arr[N-1][i];

        str.append(find(0,0));

        System.out.print(str);
        br.close();
    }
}
