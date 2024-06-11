package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/6749
 */
public class BOJ_B4_6749_Next_in_line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int Y = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        str.append(2*M-Y);

        System.out.print(str);
        br.close();
    }
}
