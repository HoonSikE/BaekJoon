package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2530
 */
public class BOJ_B4_2530_인공지능_시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 현재 시, 분, 초
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        // 요리하는데 필요한 시간(초)
        int D = Integer.parseInt(br.readLine());

        M += D/60;
        S += D%60;

        M += S/60;
        S = S%60;

        H += M/60;
        M = M%60;

        H = H%24;

        str.append(H + " " + M + " " + S);

        System.out.print(str);
        br.close();
    }
}
