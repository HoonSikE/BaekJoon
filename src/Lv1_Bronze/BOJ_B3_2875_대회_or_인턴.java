package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2875
 */
public class BOJ_B3_2875_대회_or_인턴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 대회는 여2, 남1 팀 결성
        int rerult = 0;
        while(N >= 2 && M >= 1 && M+N >= 3+K){
            N -= 2;
            M -= 1;
            rerult++;
        }

        str.append(rerult);

        System.out.print(str);
        br.close();
    }
}
