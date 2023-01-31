package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 정렬
 * https://www.acmicpc.net/problem/10989
 */
public class BOJ_B1_10989_수_정렬하기_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 수의 개수 N
        int N = Integer.parseInt(br.readLine());
        /**
         * ArraysList로 했을 때 메모리 초과가 떴다...
         * 시간복잡도에 따라 적절하게 사용하는 능력이 필요하다.
         */
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++)
            str.append(arr[i]).append("\n");

        System.out.print(str);
        br.close();
    }
}
