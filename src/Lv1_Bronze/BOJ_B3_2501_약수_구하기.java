package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2501
 */
public class BOJ_B3_2501_약수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N의 약수 들 중
        int N = Integer.parseInt(st.nextToken());
        // K번째로 작은 수를 출력
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if(N % i == 0)
                cnt++;
            if(cnt == K){
                result = i;
                break;
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
