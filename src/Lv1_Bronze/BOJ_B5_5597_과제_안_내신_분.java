package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/5597
 */
public class BOJ_B5_5597_과제_안_내신_분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int[] arr = new int[31];

        for (int i = 1; i <= 28; i++)
            arr[Integer.parseInt(br.readLine())] = 1;

        for (int i = 1; i <= 30; i++)
            if(arr[i] == 0)
                str.append(i).append("\n");

        System.out.print(str);
        br.close();
    }
}
