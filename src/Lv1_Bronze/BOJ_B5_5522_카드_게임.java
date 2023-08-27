package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/5522
 */
public class BOJ_B5_5522_카드_게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int result = 0;
        for (int n = 0; n < 5; n++)
            result += Integer.parseInt(br.readLine());

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
