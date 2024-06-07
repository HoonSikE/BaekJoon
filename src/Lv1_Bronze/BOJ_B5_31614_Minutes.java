package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/31614
 */
public class BOJ_B5_31614_Minutes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int H = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        str.append(H*60+M);

        System.out.print(str);
        br.close();
    }
}
