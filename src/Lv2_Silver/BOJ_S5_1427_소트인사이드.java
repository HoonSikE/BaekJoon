package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 문자열, 정렬
 * https://www.acmicpc.net/problem/1427
 */
public class BOJ_S5_1427_소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        /**
         * 방법 1: 카운팅 정렬 O(n)의 시간복잡도
         * 방법 2: Arrays.sort
         * 방법 3: Collections.sort or Collections.reverse
         */

        int[] cntSort = new int[10];
        // 정렬하려는 수 N
        int N = Integer.parseInt(br.readLine());

        // 자리수 만큼
        while(N != 0){
            // 각 숫자가 몇 번 등장했는지 세어준다.
            cntSort[N%10]++;
            N /= 10;
        }

        for(int i = 9; i >= 0; i--)
            while(cntSort[i] --> 0)
                str.append(i);

        System.out.print(str);
        br.close();
    }
}
