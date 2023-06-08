package Lv2_Silver;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 그리디 알고리즘
 * https://www.acmicpc.net/problem/11047
 */
public class BOJ_S4_11047_동전_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // N개의 동전 종류
        int[] arr = new int[N];
        for (int n = 0; n < N; n++)
            arr[n] = Integer.parseInt(br.readLine());

        int result = 0;
        for(int n = N-1; n >= 0; n--){
            if(K == 0)
                break;
            result += K / arr[n];
            K = K % arr[n];
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
