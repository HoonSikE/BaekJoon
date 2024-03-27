package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/24568
 */
public class BOJ_B5_24568_Cupcake_Party {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        str.append(Math.max(R*8+S*3 - 28, 0));

        System.out.print(str);
        br.close();
    }
}
