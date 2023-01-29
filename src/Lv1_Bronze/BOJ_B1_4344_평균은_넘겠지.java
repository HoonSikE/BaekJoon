package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/4344
 */
public class BOJ_B1_4344_평균은_넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // 테스트 케이스 개수 C
        int C = Integer.parseInt(br.readLine());

        for (int c = 1; c <= C; c++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int sum = 0;
            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }
            sum /= N;
            int num = 0;
            for(int i : arr)
                if(i > sum) num++;

            System.out.printf("%.3f%%\n", num*100.0/N);
        }
        br.close();
    }
}
