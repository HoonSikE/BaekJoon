package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 정렬, 이분 탐색, 해시를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/10816
 */
public class BOJ_S4_10816_숫자_카드_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 상근이가 가지고 있는 숫자 카드의 개수
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num, 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int m = 0; m < M; m++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num))
                str.append(map.get(num) + " ");
            else
                str.append(0 + " ");
        }

        System.out.print(str);
        br.close();
    }
}
