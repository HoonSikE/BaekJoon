package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2920
 */
public class BOJ_B2_2920_음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 총 8개의 음:c d e f g a b C
        /**
         * ascending: 1~8까지 차례대로 연주
         * descending: 8부터 1까지 차례대로 연주
         * mixed: 둘 다 아니라면
         */
        int[] arr = new int[8];
        boolean asc = true;
        boolean des = true;

        for (int n = 0; n < arr.length; n++)
            arr[n] = Integer.parseInt(st.nextToken());

        String result = "";

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1] - 1)
                result = "ascending";
            else if(arr[i] == arr[i+1] + 1)
                result = "descending";
            else {
                result = "mixed";
                break;
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
