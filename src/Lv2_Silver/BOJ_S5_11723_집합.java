package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 비트마스킹
 * https://www.acmicpc.net/problem/11723
 */
public class BOJ_S5_11723_집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        String S = "";

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                // 추가
                case "add":
                    break;
                // 제거
                case "remove":
                    break;
                // 있으면 1, 없으면 0
                case "check":
                    break;
                // x가 있으면 제거, 없으면 x 추가
                case "toggle":
                    break;
                // 정렬
                case "all":
                    break;
                // 공집합
                case "empty":
                    break;
            }
        }
        System.out.print(str);
        br.close();
    }
}
