package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 정렬
 * https://www.acmicpc.net/problem/18110
 */
public class BOJ_S4_18110_solved_ac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 난이도 의견의 개수
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int n = 0; n < N; n++)
            arr[n] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int tmp = (int) Math.round(N * 0.15);
        double sum = 0;
        for(int i = tmp; i < N-tmp; i++)
            sum += arr[i];

        str.append((int)Math.round(sum/(N-tmp*2)));

        System.out.print(str);
        br.close();
    }
}
