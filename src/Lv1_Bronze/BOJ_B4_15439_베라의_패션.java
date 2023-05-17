package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 조합론
 * https://www.acmicpc.net/problem/15439
 */
public class BOJ_B4_15439_베라의_패션 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        str.append(N*(N-1));

        System.out.print(str);
        br.close();
    }
}
