package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2154
 */
public class BOJ_B2_2154_수_이어_쓰기_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        StringBuilder num = new StringBuilder();

        for(int n = 1; n <= N; n++){
            num.append(n);
        }

        str.append(num.toString().indexOf(String.valueOf(N)) + 1);

        System.out.print(str);
        br.close();
    }
}
