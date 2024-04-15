package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/27327
 */
public class BOJ_B5_27327_Hour {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        str.append(Integer.parseInt(br.readLine())*24);

        System.out.print(str);
        br.close();
    }
}
