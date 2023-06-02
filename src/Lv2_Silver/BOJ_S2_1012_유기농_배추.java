package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/1012
 */
public class BOJ_S2_1012_유기농_배추 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        while(T --> 0){
            st = new StringTokenizer(br.readLine());
            // M: 가로 길이, N: 세로 길이, K: 심어진 위치 개수
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] map = new int[M][N];

            for (int n = 0; n < K; n++){
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());

                map[i][j] = 1;
            }
        }

        System.out.print(str);
        br.close();
    }
}
