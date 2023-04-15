package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/10988
 */
public class BOJ_B2_10988_팰린드롬인지_확인하기 {
    public static int isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length()-1 - i))
                return 0;

        return 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // s: 단어
        String s = br.readLine();

        str.append(isPalindrome(s));

        System.out.print(str);
        br.close();
    }
}
