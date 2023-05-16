package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 조합론
 * https://www.acmicpc.net/problem/11050
 */
public class BOJ_B1_11050_이항_계수_1 {
    static int factorial(int N){
        if(N <= 1)
            return 1;
        return N * factorial(N-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N, K
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // nCk = n! / ((n-k)! * k!)
        str.append(factorial(N) / (factorial(N-K) * factorial(K)));

        System.out.print(str);
        br.close();
    }
}
