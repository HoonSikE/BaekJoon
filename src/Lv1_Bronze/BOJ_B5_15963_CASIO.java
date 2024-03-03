package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/15963
 */
public class BOJ_B5_15963_CASIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        str.append(N==M ? 1:0);

        System.out.print(str);
        br.close();
    }
}
