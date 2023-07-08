package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/정렬
 */
public class BOJ_B4_2752_세수정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int[] arr = new int[3];

        for (int n = 0; n < 3; n++)
            arr[n] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int n : arr)
            str.append(n).append(" ");

        System.out.print(str);
        br.close();
    }
}
