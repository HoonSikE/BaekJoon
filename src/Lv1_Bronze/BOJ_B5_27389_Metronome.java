package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/27389
 */
public class BOJ_B5_27389_Metronome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        double N = Double.parseDouble(br.readLine());

        str.append(String.format("%.2f", N/4.0));

        System.out.print(str);
        br.close();
    }
}
