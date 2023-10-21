package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/5300
 */
public class BOJ_B4_5300_Fill_the_Rowboats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 1; n <= N; n++){
            str.append(n + " ");
            if(n%6 == 0 || n == N)
                str.append("Go! ");
        }

        System.out.print(str);
        br.close();
    }
}
