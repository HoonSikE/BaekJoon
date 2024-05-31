package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/31606
 */
public class BOJ_B5_31606_Fruit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        str.append(X+Y+3);

        System.out.print(str);
        br.close();
    }
}
