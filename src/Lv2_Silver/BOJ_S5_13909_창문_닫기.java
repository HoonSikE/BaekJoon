package Lv2_Silver;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학, 정수론
 * https://www.acmicpc.net/problem/13909
 */
public class BOJ_S5_13909_창문_닫기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print((int)Math.floor(Math.sqrt(Integer.parseInt(br.readLine()))));

        br.close();
    }
}
