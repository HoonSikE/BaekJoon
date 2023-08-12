package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1357
 */
public class BOJ_B1_1357_뒤집힌_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        str.append(Integer.parseInt(new StringBuffer(Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString()) + Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString())+"").reverse().toString()));

        System.out.print(str);
        br.close();
    }
}
