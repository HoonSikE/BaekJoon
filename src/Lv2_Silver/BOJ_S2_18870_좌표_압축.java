package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 정렬, 값 / 좌표 압축
 * https://www.acmicpc.net/problem/18870
 */
public class BOJ_S2_18870_좌표_압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N개의 좌표
        int N = Integer.parseInt(br.readLine());

        // 원본 배열
        int[] origin = new int[N];
        // 정렬 할 배열
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        for (int n = 0; n < N; n++)
            sorted[n] = origin[n] = Integer.parseInt(st.nextToken());

        Arrays.sort(sorted);

        // 정렬 된 배열을 순회하면서 Map에 넣어준다.
        int rank = 0;
        for(int n : sorted) {
            /**
             * 같은 원소는 순위가 동일하므로 중복되지 않을때만 순위를 매겨준다.
             */
            if(!rankMap.containsKey(n)){
                rankMap.put(n, rank);
                rank++;
            }
        }

        for(int key : origin)
            str.append(rankMap.get(key)).append(" ");

        System.out.print(str);
        br.close();
    }
}