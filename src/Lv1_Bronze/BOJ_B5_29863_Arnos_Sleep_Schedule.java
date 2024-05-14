package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/29863
 */
public class BOJ_B5_29863_Arnos_Sleep_Schedule {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if(N > M){
            str.append(M+24-N);
        }else{
            str.append(M-N);
        }

        System.out.print(str);
        br.close();
    }
}
