package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2857
 */
public class BOJ_B3_2857_FBI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N: 5명의 FBI 요원
        int N = 5;
        boolean flag = false;

        for (int n = 1; n <= N; n++){
            String s = br.readLine();
            // FBI와 -가 포함되어 있지 않다면 continue;
            if(s.contains("FBI")){
                str.append(n + " ");
                flag = true;
            }
        }

        if(!flag){
            str.append("HE GOT AWAY!");
        }

        System.out.print(str);
        br.close();
    }
}
