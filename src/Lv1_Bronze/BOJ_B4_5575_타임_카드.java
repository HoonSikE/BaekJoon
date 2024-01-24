package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/5575
 */
public class BOJ_B4_5575_타임_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 3;

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());

            // 출근 시간
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());
            // 퇴근 시간
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            // 근무 시간
            if(s2-s1 < 0){
                s2 += 60;
                m2 -= 1;
            }
            int s = s2-s1;
            if(m2-m1 < 0){
                m2 += 60;
                h2 -= 1;
            }
            int m = m2-m1;
            int h = h2-h1;
            str.append(h + " " + m + " " + s + "\n");
        }
        System.out.print(str);
        br.close();
    }
}
