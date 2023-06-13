package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2744
 */
public class BOJ_B5_2744_대소문자_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String s = br.readLine();

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c))
                str.append(Character.toLowerCase(c));
            else
                str.append(Character.toUpperCase(c));
        }

        System.out.print(str);
        br.close();
    }
}
