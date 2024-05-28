package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/31450
 */
public class BOJ_B5_31450_Everyone_is_a_winner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        str.append(M%K == 0 ? "Yes" : "No");

        System.out.print(str);
        br.close();
    }
}
