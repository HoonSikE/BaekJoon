package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2420
 */
public class BOJ_B5_2420_사파리월드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        str.append(Math.abs(Long.parseLong(st.nextToken())-Long.parseLong(st.nextToken())));

        System.out.print(str);
        br.close();
    }
}
