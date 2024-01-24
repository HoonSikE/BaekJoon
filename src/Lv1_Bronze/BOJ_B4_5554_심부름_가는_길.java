package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/5554
 */
public class BOJ_B4_5554_심부름_가는_길 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = 4;

        int time = 0;
        for (int n = 0; n < N; n++){
            time += Integer.parseInt(br.readLine());
        }

        str.append(time/60).append("\n");
        str.append(time%60);

        System.out.print(str);
        br.close();
    }
}
