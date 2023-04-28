package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 정렬, 이분 탐색
 * https://www.acmicpc.net/problem/1920
 */
public class BOJ_S4_1920_수_찾기 {
    static int N;
    static int[] arr;
    public static int binarySearch(int num){
        int left = 0;
        int right = N -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(num < arr[mid])
                right = mid - 1;
            else if(num > arr[mid])
                left = mid + 1;
            else
                return 1;
        }

        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++)
            arr[n] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        // M
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int m = 0; m < M; m++)
            str.append(binarySearch(Integer.parseInt(st.nextToken()))).append("\n");

        System.out.print(str);
        br.close();
    }
}
