package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열
 * https://www.acmicpc.net/problem/2745
 */
public class BOJ_B2_2745_진법_변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());


        System.out.print(str);
        br.close();
    }
}
