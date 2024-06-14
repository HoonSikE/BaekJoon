package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/6778
 */
public class BOJ_B4_6778_Which_Alien {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        // 더듬이 최소 3, 눈 최대 4
        if(A >= 3 && E <= 4)
            str.append("TroyMartian\n");
        // 더듬이 최대 6, 눈 최소 2
        if(A <= 6 && E >= 2)
            str.append("VladSaturnian\n");
        // 더듬이 최대 2, 눈 최대 3
        if(A <= 2 && E <= 3)
            str.append("GraemeMercurian\n");

        System.out.print(str);
        br.close();
    }
}
