package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 브루트포스 알고리즘, 백트래킹
 * https://www.acmicpc.net/problem/14888
 */
public class BOJ_S1_14888_연산자_끼워넣기 {
    static int N;
    static int[] arr, operator;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void cal(int idx, int num){
        if(idx == N){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if(operator[i] > 0){
                operator[i]--;
                switch (i){
                    case 0:
                        cal(idx+1, num + arr[idx]);
                        break;
                    case 1:
                        cal(idx+1, num - arr[idx]);
                        break;
                    case 2:
                        cal(idx+1, num * arr[idx]);
                        break;
                    case 3:
                        cal(idx+1, num / arr[idx]);
                        break;
                }
                operator[i]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 수의 개수
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++)
            arr[n] = Integer.parseInt(st.nextToken());

        // 덧셈, 뺼셈, 곱셈, 나눗셈의 개수
        operator = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++)
            operator[i] = Integer.parseInt(st.nextToken());

        cal(1, arr[0]);

        str.append(max).append("\n");
        str.append(min).append("\n");

        System.out.print(str);
        br.close();
    }
}
