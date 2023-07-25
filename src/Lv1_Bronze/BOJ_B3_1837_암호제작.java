package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/1837
 */
public class BOJ_B3_1837_암호제작 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[K+1];
        prime[1] = true;

        for(int i = 2; i < K; i++){
            // 소수라면 넘어간다.
            if(prime[i])
                continue;

            BigInteger num = new BigInteger(Integer.toString(i));
            // num이 K보다 작은 소수라면 BAD
            if(P.mod(num).compareTo(BigInteger.ZERO) == 0){
                System.out.println("BAD " + num);
                return;
            }
            for(int j = i + i; j <= K; j += i){
                prime[j] = true;
            }
        }

        str.append("GOOD");

        System.out.print(str);
        br.close();
    }
}
