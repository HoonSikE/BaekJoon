package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1718
 */
public class BOJ_B2_1718_암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String A = br.readLine();
        String B = br.readLine();

        int bIdx = 0;
        for(int i = 0; i < A.length(); i++){
            int a = A.charAt(i) - 'a';
            int b = B.charAt(bIdx) - 'a' + 1;

            if(A.charAt(i) == ' ') {
                str.append(" ");
            }else{
                str.append((char)((26 + a - b)%26 + 'a') + "");
            }
            bIdx++;
            bIdx = bIdx % B.length();
        }

        System.out.print(str);
        br.close();
    }
}
