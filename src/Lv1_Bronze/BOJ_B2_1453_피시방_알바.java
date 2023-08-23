package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/1453
 */
public class BOJ_B2_1453_피시방_알바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 손님의 수
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[101];
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            int num = Integer.parseInt(st.nextToken());
            if(arr[num])
                answer++;
            else
                arr[num] = true;
        }

        str.append(answer);

        System.out.print(str);
        br.close();
    }
}
