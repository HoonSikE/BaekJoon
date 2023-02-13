package Lv2_Silver;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/3003
 */
public class BOJ_S2_4948_베르트랑_공준 {
    // 1 <= n <= 123,456 이므로 2n+1 범위 산정
    static boolean[] prime = new boolean[123456*2+1];
    public static void getPrime(){
        prime[0] = true;
        prime[1] = true;
        // 에라토스테네스의 체
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 소수 판별
        getPrime();

        while(true){
            // 테스트 케이스 개수 T
            int n = Integer.parseInt(br.readLine());
            // 입력의 마지막은 0
            if(n == 0)
                break;

            // n보다 크고, 2n보다 작거나 같은 소수의 개수
            int cnt = 0;
            for(int i = n+1; i <= 2*n; i++)
                if(!prime[i]) cnt++;
            str.append(cnt).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
