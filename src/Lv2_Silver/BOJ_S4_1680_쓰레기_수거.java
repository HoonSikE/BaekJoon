package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1680
 */
public class BOJ_S4_1680_쓰레기_수거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            // W: 쓰레기차 용량, N: 지점의 개수
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            /**
             * 쓰레기장으로 돌아가 싣고 있는 쓰레기를 비우는 경우의 수
             * 1. 쓰레기의 양이 용량에 도달했을 때
             * 2. 그 지점의 쓰레기를 실었을 떄 쓰레기차의 용량을 넘게 될 때
             * 3. 더 이상 쓰레기를 실을 지점이 없을 때
             */
            int result = 0;
            int weight = 0;
            for (int n = 0; n < N; n++){
                st = new StringTokenizer(br.readLine());
                // x: 쓰레기장으로 부터 거리, w: 쓰레기의 양
                int x = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());

                // 1. 쓰레기 수거 용량이 넘칠 때
                while(W < weight+w){
                    result += x*2;
                    w = w - (W-weight);
                    weight = 0;
                }
                // 2. 쓰레기 수거 및 다음 수거장 이동
                if(W > w){
                    weight += w;
                    // 마지막이라면 바로 회수
                    if(n == N-1){
                        result += x*2;
                    }
                }
                // 3. 쓰레기 수거 용량이 딱 맞을 때
                else if(W == w){
                    result += x*2;
                    weight = 0;
                }
            }
            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}