package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 정수론
 * https://www.acmicpc.net/problem/1816
 */
public class BOJ_B1_1816_암호_키 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            Integer.parseInt(br.readLine());
        }
        System.out.print(str);
        br.close();
    }
}
