package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그리디 알고리즘, 정렬
 * https://www.acmicpc.net/problem/1449
 */
public class BOJ_S3_1449_수리공_항승 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 물이 새는 곳의 개수
        int N = Integer.parseInt(st.nextToken());
        // L: 테이프의 길이
        int L = Integer.parseInt(st.nextToken());

        int result = 0;
        int[] pipe = new int[1001];
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            pipe[Integer.parseInt(st.nextToken())] = 1;
        }

        // 테이프 길이가 1일때는 빠르게 계산
        if(L==1){
            System.out.println(N/L);
            return;
        }

        for(int i = 1; i <= 1000; i++){
            // 구멍이 발견되면 테이프를 쭉 붙여버린다.
            if(pipe[i] != 0){
                i += L-1;
                result++;
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
