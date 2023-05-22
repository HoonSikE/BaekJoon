package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1075
 */
public class BOJ_B2_1075_나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = (N/100)*100;

        while(true){
            if(N%F == 0){
                System.out.printf("%02d", N%100);
                break;
            }
            N++;
        }

        br.close();
    }
}
