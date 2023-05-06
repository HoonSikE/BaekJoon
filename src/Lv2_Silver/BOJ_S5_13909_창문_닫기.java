package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 정수론
 * https://www.acmicpc.net/problem/13909
 */
public class BOJ_S5_13909_창문_닫기 {
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
