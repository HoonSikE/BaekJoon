package Lv2_Silver;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/3003
 */
public class BOJ_S5_2581_소수 {
    static boolean[] prime;
    // 에라토스테네스 체
    // 시간복잡도 O(N㏒(㏒N)) -> 매우 좋은 성능
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

        // M~N 이하의 자연수
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N+1];

        int sum = 0;
        int min = -1;

        getPrime();

        for(int i = M; i <= N; i++){
            // 소수라면
            if(!prime[i]){
                sum += i;
                if(min == -1)
                    min = i;
            }
        }

        if(sum == 0)
            str.append(-1);
        else
            str.append(sum).append("\n").append(min);

        System.out.print(str);
        br.close();
    }
}
