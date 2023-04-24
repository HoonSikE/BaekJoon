package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2475
 */
public class BOJ_B5_2475_검증수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int sum = 0;

        for (int n = 0; n < 5; n++){
            int tmp = Integer.parseInt(st.nextToken());
            sum += tmp*tmp;
        }

        str.append(sum%10);

        System.out.print(str);
        br.close();
    }
}
