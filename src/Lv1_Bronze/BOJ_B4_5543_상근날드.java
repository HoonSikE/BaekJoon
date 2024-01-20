package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/5543
 */
public class BOJ_B4_5543_상근날드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();


        int A = Integer.MAX_VALUE;
        for (int n = 0; n < 3; n++){
            A = Math.min(A, Integer.parseInt(br.readLine()));
        }

        int B = Integer.MAX_VALUE;
        for (int n = 0; n < 2; n++){
            B = Math.min(B, Integer.parseInt(br.readLine()));
        }

        str.append(A+B-50);

        System.out.print(str);
        br.close();
    }
}
