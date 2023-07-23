package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1145
 */
public class BOJ_B1_1145_적어도_대부분의_배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 5;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            arr[n] = Integer.parseInt(st.nextToken());
        }

        int result = 1;
        int cnt = 0;
        while(true){
            for (int n = 0; n < N; n++){
                if(result % arr[n] == 0){
                    cnt++;
                }
            }
            if(cnt >= 3)
                break;
            result++;
            cnt = 0;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
