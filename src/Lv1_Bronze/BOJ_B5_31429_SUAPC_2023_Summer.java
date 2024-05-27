package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/31429
 */
public class BOJ_B5_31429_SUAPC_2023_Summer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        switch (N) {
            case 1:
                str.append(12 + " " + 1600);
                break;
            case 2:
                str.append(11 + " " + 894);
                break;
            case 3:
                str.append(11 + " " + 1327);
                break;
            case 4:
                str.append(10 + " " + 1311);
                break;
            case 5:
                str.append(9 + " " + 1004);
                break;
            case 6:
                str.append(9 + " " + 1178);
                break;
            case 7:
                str.append(9 + " " + 1357);
                break;
            case 8:
                str.append(8 + " " + 837);
                break;
            case 9:
                str.append(7 + " " + 1055);
                break;
            case 10:
                str.append(6 + " " + 556);
                break;
            case 11:
                str.append(6 + " " + 773);
                break;
        }

        System.out.print(str);
        br.close();
    }
}
