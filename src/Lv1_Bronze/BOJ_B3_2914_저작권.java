package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/.
 */
public class BOJ_B3_2914_저작권 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        str.append(A*(I-1)+1);

        System.out.print(str);
        br.close();
    }
}
