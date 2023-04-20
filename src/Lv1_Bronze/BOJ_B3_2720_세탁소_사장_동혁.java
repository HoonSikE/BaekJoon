package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 그리디 알고리즘, 사칙연삭
 * https://www.acmicpc.net/problem/2720
 */
public class BOJ_B3_2720_세탁소_사장_동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            int money = Integer.parseInt(br.readLine());

            // 쿼터(0.25) - 다임(0.1) - 니켈(0.05) - 페니(0.01)의 개수
            int quater = money/25;
            money %= 25;
            int dime = money/10;
            money %= 10;
            int nickel = money/5;
            money %= 5;
            int penny = money;

            str.append(quater).append(" ");
            str.append(dime).append(" ");
            str.append(nickel).append(" ");
            str.append(penny).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
