package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/3046
 */
public class BOJ_B4_3046_R2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        // S = (R1+R2)/2
        // 2*S = R1 + R2
        // R2 = 2*S - R1
        str.append(S*2 - R1);

        System.out.print(str);
        br.close();
    }
}
