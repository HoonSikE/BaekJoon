package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10170
 */
public class BOJ_B5_10189_Hook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        str.append("#  # #### #### #  #\n" +
                "#### #  # #  # # #\n" +
                "#### #  # #  # # #\n" +
                "#  # #### #### #  #");

        System.out.print(str);
        br.close();
    }
}
