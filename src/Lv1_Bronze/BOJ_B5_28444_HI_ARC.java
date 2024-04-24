package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/28444
 */
public class BOJ_B5_28444_HI_ARC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        str.append(H*I-A*R*C);

        System.out.print(str);
        br.close();
    }
}
