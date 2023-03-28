package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/15894
 */
public class BOJ_B3_15894_수학은_체육과목_입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 상자를 잘 보면 위쪽에 올라간 실선들을 가장 밑칸의 상자들에 넣으면 딱 맞다.
        str.append(Long.parseLong(br.readLine())*4);

        System.out.print(str);
        br.close();
    }
}
