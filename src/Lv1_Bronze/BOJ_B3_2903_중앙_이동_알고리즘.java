package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/2903
 */
public class BOJ_B3_2903_중앙_이동_알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int width = 3;

        for(int n = 1; n < N; n++)
            width = width*2 - 1;

        str.append(width*width);

        System.out.print(str);
        br.close();
    }
}
