package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10170
 */
public class BOJ_B5_10170_NFC_West_vs_North {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        str.append("NFC West       W   L  T\n" +
                "-----------------------\n" +
                "Seattle        13  3  0\n" +
                "San Francisco  12  4  0\n" +
                "Arizona        10  6  0\n" +
                "St. Louis      7   9  0\n" +
                "\n" +
                "NFC North      W   L  T\n" +
                "-----------------------\n" +
                "Green Bay      8   7  1\n" +
                "Chicago        8   8  0\n" +
                "Detroit        7   9  0\n" +
                "Minnesota      5  10  1");

        System.out.print(str);
        br.close();
    }
}
