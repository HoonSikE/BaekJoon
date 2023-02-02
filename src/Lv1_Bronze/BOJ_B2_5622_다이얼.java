package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/5622
 */
public class BOJ_B2_5622_다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 알파벳
        String alpha = br.readLine();
        int result = 0;

        for (int i = 0; i < alpha.length(); i++){
            char tmp = alpha.charAt(i);

            if('A' <= tmp && tmp <= 'C')
                result += 2 + 1;
            else if('D' <= tmp && tmp <= 'F')
                result += 2 + 2;
            else if('G' <= tmp && tmp <= 'I')
                result += 2 + 3;
            else if('J' <= tmp && tmp <= 'L')
                result += 2 + 4;
            else if('M' <= tmp && tmp <= 'O')
                result += 2 + 5;
            else if('P' <= tmp && tmp <= 'S')
                result += 2 + 6;
            else if('T' <= tmp && tmp <= 'V')
                result += 2 + 7;
            else if('W' <= tmp && tmp <= 'Z')
                result += 2 + 8;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
