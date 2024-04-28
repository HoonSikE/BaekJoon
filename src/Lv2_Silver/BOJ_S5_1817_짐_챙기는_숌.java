package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 그리디 알고리즘
 * https://www.acmicpc.net/problem/1817
 */
public class BOJ_S5_1817_짐_챙기는_숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 책의 개수, M: 최대 무게
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.print(0);
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int result = 1;
        int current = 0;

        for(int w : list){
            current += w;
            if(current > M){
                result++;
                current = w;
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
