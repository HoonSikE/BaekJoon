package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/27433
 */
public class BOJ_B5_27433_팩토리얼_2 {
    public static int factorial(int n){
        if(n <= 0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(factorial(Integer.parseInt(br.readLine())));

        br.close();
    }
}
