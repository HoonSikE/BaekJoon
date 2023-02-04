package Lv3_Gold;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 자료 구조, 누적 합, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/2015
 */
public class BOJ_G4_2015_수들의_합_4 {
    static int K, result;
    public static void combination(int start, int count, int sum, ArrayList<Integer> list) {
        if(count == 2) {
            if(sum == K) result++;
            return;
        }
        for (int i = start; i < list.size(); i++) {
            sum += list.get(i);
            if(sum > K) break;
            combination(i+1, count+1, sum, list);
            sum -= list.get(i);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N : 배열의 크기
        int N = Integer.parseInt(st.nextToken());
        // K : 부분합이 K인 것이 몇개나 있는지?
        K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        result = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);
        combination(0, 0, 0, list);
        System.out.println(result);
        br.close();
    }
}
