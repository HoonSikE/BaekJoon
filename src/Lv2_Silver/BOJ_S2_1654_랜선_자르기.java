package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 이분 탐색, 매개 변수 탐색
 * https://www.acmicpc.net/problem/1654
 */
public class BOJ_S2_1654_랜선_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // K: 이미 가지고 있는 랜선의 개수
        int K = Integer.parseInt(st.nextToken());
        // N: 필요한 랜선의 개수
        int N = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int k = 0; k < K; k++){
            Integer.parseInt(br.readLine());
        }

        if(K >= N)
            ;

        System.out.print(str);
        br.close();
    }
}
