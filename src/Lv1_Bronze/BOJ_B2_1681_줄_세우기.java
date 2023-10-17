package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1681
 */
public class BOJ_B2_1681_줄_세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 학생 수, L: 제외 하는 라벨 숫자
        int N = Integer.parseInt(st.nextToken());
        String L = st.nextToken();

        int answer = 1;
        int count = 0;
        while(count != N){
            if((answer + "").contains(L)) {
                answer++;
                continue;
            }
            answer++;
            count++;
        }

        str.append(answer-1);

        System.out.print(str);
        br.close();
    }
}
