package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 정수론
 * https://www.acmicpc.net/problem/6888
 */
public class BOJ_B4_6888_Terms_of_Office {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        for (int n = X; n <= Y; n+=60){
            str.append("All positions change in year ").append(n).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
