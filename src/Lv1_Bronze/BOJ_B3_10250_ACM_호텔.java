package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/10250
 */
public class BOJ_B3_10250_ACM_호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        // H: 층 수, W: 각 층의 방 수, N: 몇 번째 손님
        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if(N%H == 0)
                str.append(H*100 + N/H).append("\n");
            else
                str.append(N%H*100 + N/H + 1).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}