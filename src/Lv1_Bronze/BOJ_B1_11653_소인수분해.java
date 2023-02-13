package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학, 정수론, 소수 판정
 * https://www.acmicpc.net/problem/11653
 */
public class BOJ_B1_11653_소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 정수 N
        int N = Integer.parseInt(br.readLine());

        // 에라토스테네스의 체 활용
        for(int i = 2; i <= Math.sqrt(N); i++)
            // 나눠진다면 약수이다.
            while(N % i == 0){
                str.append(i).append("\n");
                N /= i;
            }

        if(N != 1)
            str.append(N);

        System.out.print(str);
        br.close();
    }
}
