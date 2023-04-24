package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2577
 */
public class BOJ_B2_2577_숫자의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        long mul = Long.parseLong(br.readLine()) * Long.parseLong(br.readLine()) * Long.parseLong(br.readLine());

        int[] arr = new int[10];

        while(mul > 0){
            arr[(int)mul%10]++;
            mul /= 10;
        }

        for(int n : arr)
            str.append(n).append("\n");

        System.out.print(str);
        br.close();
    }
}
