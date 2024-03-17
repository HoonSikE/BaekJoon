package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/21300
 */
public class BOJ_B5_21300_Boottle_Return {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = 6;
        int sum = 0;

        for (int n = 0; n < N; n++){
            sum += Integer.parseInt(st.nextToken());
        }

        str.append(sum*5);

        System.out.print(str);
        br.close();
    }
}
