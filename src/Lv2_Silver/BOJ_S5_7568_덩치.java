package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/7568
 */
public class BOJ_S5_7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            arr[n][0] = Integer.parseInt(st.nextToken());
            arr[n][1] = Integer.parseInt(st.nextToken());
            arr[n][2] = 1;

            for(int i = 0; i < n; i++){
                if(arr[i][0] < arr[n][0] && arr[i][1] < arr[n][1])
                    arr[i][2]++;
                else if(arr[i][0] > arr[n][0] && arr[i][1] > arr[n][1])
                    arr[n][2]++;
            }
        }

        for(int n = 0; n < N; n++)
            str.append(arr[n][2]).append(" ");

        System.out.print(str);
        br.close();
    }
}
