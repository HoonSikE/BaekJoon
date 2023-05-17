package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 정수론, 소수 판정, 에라토스테네스의 체
 * https://www.acmicpc.net/problem/17103
 */
public class BOJ_S2_17103_골드바흐_파티션 {
    public static boolean[] prime = new boolean[1000001];
    // 에라토스테네스의 체
    public static void getPrime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            // 보통 if문을 사용하지 않는 소스코드가 많지만
            // 이미 판별한 것을 굳이 또 반복할 필요가 업어보여서 continue를 추가했다.
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        getPrime();

        for (int n = 0; n < N; n++){
            int num = Integer.parseInt(br.readLine());
            int ans = 0;

            for(int i = 2; i <= num/2; i++)
                if(!prime[i] && !prime[num-i])
                    ans++;

            str.append(ans).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
