package Lv2_Silver;

import java.io.*;
import java.math.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 정수론, 소수 판정
 * https://www.acmicpc.net/problem/4134
 */
public class BOJ_S4_4134_다음_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T
        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
            String s = br.readLine();
            /**
             * 입력이 40억으로 매우 큰 값을 사용한다.
             * BigInteger: 매우 큰 수를 사용할 때 사용한다.
             * isProbablePrime(int certainty) : 보통 certainty=10으로 사용 -> 소수인게 거의 확실
             * nextProbablePrime() : 다음 소수를 찾는다.
             */
            BigInteger prime = new BigInteger(s);
            long num = Long.parseLong(s);

            if(prime.isProbablePrime(10))
                str.append(num).append("\n");
            else
                str.append(prime.nextProbablePrime()).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
