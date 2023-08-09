package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/1350
 */
public class BOJ_B2_1350_진짜_공간 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            arr[n] = Long.parseLong(st.nextToken());
        }

        long C = Long.parseLong(br.readLine());

        long answer = 0;

        for(int n = 0; n < arr.length; n++){
            if(arr[n]%C == 0)
                answer += arr[n]/C;
            else
                answer += arr[n]/C + 1;
        }

        str.append(answer*C);

        System.out.print(str);
        br.close();
    }
}
