package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 정렬, 사칙연산
 * https://www.acmicpc.net/problem/2587
 */
public class BOJ_B2_2587_대표값2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        // 5개의 숫자
        for (int i = 0; i < 5; i++){
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }
        // Array.sort 보다 Collection.sort가 더 빠르다.
        Collections.sort(list);
        str.append(sum/5).append("\n").append(list.get(2));
        System.out.print(str);
        br.close();
    }
}
