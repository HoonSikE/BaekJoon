package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 정수론, 소수 판정, 에라토스테네스의 체
 * https://www.acmicpc.net/problem/9020
 */
public class BOJ_S2_9020_골드바흐의_추측 {
    // n의 범위는 10,000 이하이다.
    static boolean[] prime = new boolean[10001];
    // 에라토스테네스의 체
    public static void getPrime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        // 소수 판별
        getPrime();

        for (int t = 0; t < T; t++){
            // 짝수 n
            int n = Integer.parseInt(br.readLine());

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            // 완전탐색
            for(int i = 2; i <= n/2; i++){
                // 골드바흐 수가 존재할 때
                // 두 소수의 차이가 가장 작은 것으로 갱신
                if(!prime[i] && !prime[n-i]){
                    max = n - i;
                    min = i;
                }
            }
            str.append(min + " " + max + "\n");
        }
        System.out.print(str);
        br.close();
    }
}
