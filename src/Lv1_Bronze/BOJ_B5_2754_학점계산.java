package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2754
 */
public class BOJ_B5_2754_학점계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String grade = br.readLine();

        if(grade.equals("F")){
            System.out.println(0.0);
            return;
        }

        double result = 4.0 - (grade.charAt(0) - 'A');

        switch(grade.charAt(1)){
            case '+':
                result += .3;
                break;
            case '-':
                result -= .3;
                break;
            default:
                break;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
