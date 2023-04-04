package Lv3_Gold;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 누적 합
 * https://www.acmicpc.net/problem/10986
 */
public class BOJ_G3_10986_나머지_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 수의 개수
        int N = Integer.parseInt(st.nextToken());
        // M
        int M = Integer.parseInt(st.nextToken());

        // 현재 누적 나머지
        int current = 0;
        // 나머지의 집합 (0 ~ M-1)
        int[] remainder = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int n = 1; n <= N; n++) {
            current += Long.parseLong(st.nextToken())%M;
            // 배열 내부 원소는 Integer형이다.
            remainder[current%M]++;
        }

        // 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수
        // 나머지가 0인 부분은 구간으로 포함
        long result = remainder[0];
        /**
         * 식 도출 과정
         * (remainder[j] - remainder[i]) % M == 0
         * remainder[j]%M - remainder[i]%M == 0
         * remainder[j]%M == remainder[j]%M
         * 결국 같은 나머지를 가진 누적합 구간 중 2개를 순서없이 뽑는 경우의 수를 세면 된다.
         * N개의 수를 순서없이 2개를 고르는 경우의 수는 n*(n-1)/(2*1)
         */
        for(int i = 0; i < M; i++)
            result += ((long)remainder[i]*(remainder[i]-1))/2;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
