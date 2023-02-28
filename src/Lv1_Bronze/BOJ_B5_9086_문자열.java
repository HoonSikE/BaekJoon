package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/9086
 */
public class BOJ_B5_9086_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            String tmp = br.readLine();
            str.append(tmp.charAt(0)).append(tmp.charAt(tmp.length()-1)).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
