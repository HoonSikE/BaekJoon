package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/27324
 */
public class BOJ_B5_27324_Same_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        if(N%10 == (N/10)%10)
            str.append(1);
        else
            str.append(0);

        System.out.print(str);
        br.close();
    }
}
