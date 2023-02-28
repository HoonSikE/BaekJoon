package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/25314
 */
public class BOJ_B5_25314_코딩은_체육과목_입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N/4; n++)
            str.append("long ");

        if(N%4 ==0)
            str.append("int");
        else
            str.append("long int");

        System.out.print(str);
        br.close();
    }
}
