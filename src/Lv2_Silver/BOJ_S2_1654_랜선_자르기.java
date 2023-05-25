package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 이분 탐색, 매개 변수 탐색
 * https://www.acmicpc.net/problem/1654
 */
public class BOJ_S2_1654_랜선_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // K: 이미 가지고 있는 랜선의 개수
        int K = Integer.parseInt(st.nextToken());
        // N: 필요한 랜선의 개수
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = Long.MIN_VALUE;

        for (int k = 0; k < K; k++){
            arr[k] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[k]);
        }

        max++;

        long min = 0;

        /**
         * 이분탐색 응용
         * 이분탐색: 찾고자 하는 값이 없으면 탐색 실패
         * Lower bound: 찾고자 하는 값 이상이 처음 나타나는 위치
         * Lower bound: 찾고자 하는 값보다 큰 값이 처음 나타나는 위치
         */
        while(min < max){
            // 중간 길이를 구한다.
            long mid = (max+min)/2;
            long cnt = 0;

            // 중간 길이로 잘랐을 때 몇 개가 만들어 지는지 확인
            for(int i = 0; i < arr.length; i++)
                cnt += arr[i]/mid;

            if(cnt < N)
                max = mid;
            else
                min = mid + 1;
        }

        str.append(min - 1);

        System.out.print(str);
        br.close();
    }
}
