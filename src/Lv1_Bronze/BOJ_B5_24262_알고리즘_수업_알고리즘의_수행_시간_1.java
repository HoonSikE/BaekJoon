package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/24262
 */
public class BOJ_B5_24262_알고리즘_수업_알고리즘의_수행_시간_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // n
        int n = Integer.parseInt(br.readLine());

        // 단순 계산 후 값을 리턴하므로 시간복잡도는 O(1)이다.
        str.append("1").append("\n");
        str.append("0").append("\n");

        System.out.print(str);
        br.close();
    }
}
