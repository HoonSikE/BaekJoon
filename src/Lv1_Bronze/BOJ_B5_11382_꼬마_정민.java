package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/11382
 */
public class BOJ_B5_11382_꼬마_정민 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        long sum = 0;

        for (int n = 0; n < 3; n++)
            sum += Long.parseLong(st.nextToken());

        str.append(sum);

        System.out.print(str);
        br.close();
    }
}
