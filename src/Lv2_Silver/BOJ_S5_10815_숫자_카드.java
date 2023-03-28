package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 정렬, 이분 탐색
 * https://www.acmicpc.net/problem/10815
 */
public class BOJ_S5_10815_숫자_카드 {
    static int N, M;
    static int[] arr;
    // 이분 탐색 (범위를 절반씩 추려서 탐색한다.)
    public static boolean binarySearch(int n){
        int leftIdx = 0;
        int rightIdx = N-1;

        while(leftIdx <= rightIdx){
            int midIdx = (leftIdx + rightIdx) / 2;
            int mid = arr[midIdx];

            if(n < mid)
                rightIdx = midIdx - 1;
            else if(n > mid)
                leftIdx = midIdx + 1;
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 숫자 카드의 개수
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++)
            arr[n] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        // M: 숫자 카드인지 아닌지 구별할 카드 개수
        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < M; n++){
            int num = Integer.parseInt(st.nextToken());
            // 이분탐색 실행
            if(binarySearch(num))
                str.append("1 ");
            else
                str.append("0 ");
        }

        System.out.print(str);
        br.close();
    }
}
