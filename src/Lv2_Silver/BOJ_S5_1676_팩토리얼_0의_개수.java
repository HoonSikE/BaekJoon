package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/1676
 */
public class BOJ_S5_1676_팩토리얼_0의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(N >= 5){
            cnt += N / 5;
            N /= 5;
        }

        str.append(cnt);

        System.out.print(str);
        br.close();
    }
}
