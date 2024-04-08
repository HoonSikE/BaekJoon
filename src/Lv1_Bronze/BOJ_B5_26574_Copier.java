package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/26574
 */
public class BOJ_B5_26574_Copier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            int num = Integer.parseInt(br.readLine());
            str.append(num + " " + num + "\n");
        }
        System.out.print(str);
        br.close();
    }
}
