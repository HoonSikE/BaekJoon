package Lv3_Gold;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2251
 */
public class BOJ_G5_2251_물통 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = 3;
        int[] num = new int[N];
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++)
                set.add(num[j] - num[i]);
            set.add(num[i]);
        }
        for (int i = 1; i <= num[2]; i++)
            if(set.contains(i))
                if((num[2] - i) <= num[1])
                    str.append(i).append(" ");

/*        // 세 정수 A, B, C
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());*/

        System.out.print(str);
        br.close();
    }
}
