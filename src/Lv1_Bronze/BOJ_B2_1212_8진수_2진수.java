package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1212
 */
public class BOJ_B2_1212_8진수_2진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        String N = br.readLine();
        String[] b = {"000","001","010","011","100","101","110","111"};

        if(N.equals("0")){
            System.out.print(N);
            return;
        }

        for(int n = 0; n < N.length(); n++){
            int idx = N.charAt(n) - '0';
            str.append(b[idx]);
        }

        while(str.charAt(0) == '0'){
            str = new StringBuilder(str.substring(1));
        }

        System.out.print(str);
        br.close();
    }
}
