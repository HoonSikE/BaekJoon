package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 정렬
 * https://www.acmicpc.net/problem/2751
 */
public class BOJ_S5_2751_수_정렬하기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N개의 수
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));

        Collections.sort(list);

        for (int n : list)
            str.append(n).append("\n");

        System.out.print(str);
        br.close();
    }
}
