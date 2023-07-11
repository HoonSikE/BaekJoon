package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/4299
 */
public class BOJ_B4_4299_AFC_윔블던 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // A = a + b
        // B = |a - b|
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if((A+B)%2 != 0 || A < B)
            str.append(-1);
        else
            str.append((A+B)/2).append(" ").append((A+B)/2 - B);

        System.out.print(str);
        br.close();
    }
}
