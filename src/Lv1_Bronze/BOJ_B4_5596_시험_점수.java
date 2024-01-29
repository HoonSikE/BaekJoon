package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/5596
 */
public class BOJ_B4_5596_시험_점수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 2;
        int result = 0;

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            for(int i = 0; i < 4; i++){
                sum += Integer.parseInt(st.nextToken());
            }
            result = Math.max(result, sum);
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
