package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 이분 탐색, 매개 변수 탐색
 * https://www.acmicpc.net/problem/2805
 */
public class BOJ_S2_2805_나무_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 나무의 수, M: 나무의 길이
        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        long max = Long.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++) {
            arr[n] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[n]);
        }


        long min = 0;

        while(min < max) {
            long mid = (min+max)/2;
            long length = 0;

            for(int n = 0; n < arr.length; n++)
                if(arr[n] > mid)
                    length += arr[n] - mid;

            if(length < M)
                max = mid;
            else
                min = mid + 1;
        }

        str.append(min-1);

        System.out.print(str);
        br.close();
    }
}
