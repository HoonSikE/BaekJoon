package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 완전탐색
 * https://www.acmicpc.net/problem/1065
 */
public class BOJ_S4_1065_한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 자연수 N
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        if(N < 100)
            cnt = N;
        else{
            cnt = 99;

            for(int i = 100; i <= N; i++){
                int A = i / 100;
                int B = (i / 10) % 10;
                int C = i % 10;

                if((A-B)==(B-C))
                    cnt++;
            }
        }

        str.append(cnt);

        System.out.print(str);
        br.close();
    }
}
