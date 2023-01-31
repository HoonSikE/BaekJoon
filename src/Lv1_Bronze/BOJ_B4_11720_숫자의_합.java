package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 문자열
 * https://www.acmicpc.net/problem/11720
 */
public class BOJ_B4_11720_숫자의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 숫자 개수 N
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;

        for (int i = 0; i < N; i++)
            sum += num.charAt(i)-'0';

        str.append(sum);

        System.out.print(str);
        br.close();
    }
}
