package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/26766
 */
public class BOJ_B5_26766_Serca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            str.append(" @@@   @@@ \n" +
                    "@   @ @   @\n" +
                    "@    @    @\n" +
                    "@         @\n" +
                    " @       @ \n" +
                    "  @     @  \n" +
                    "   @   @   \n" +
                    "    @ @    \n" +
                    "     @     \n");
        }
        System.out.print(str);
        br.close();
    }
}
