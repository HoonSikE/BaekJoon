package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/2921
 */
public class BOJ_B3_2921_도미노 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for(int n = 0; n <= N; n++){
            for(int m = n; m <= N; m++){
                result += n;
                result += m;
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
