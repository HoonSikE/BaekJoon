package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/사칙연산
 */
public class BOJ_B5_24736_Fooball_Scoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 2;

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            str.append(6*T+3*F+2*S+1*P+2*C).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
