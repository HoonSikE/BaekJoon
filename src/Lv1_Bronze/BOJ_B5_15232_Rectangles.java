package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/15232
 */
public class BOJ_B5_15232_Rectangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++){
                str.append("*");
            }
            str.append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
