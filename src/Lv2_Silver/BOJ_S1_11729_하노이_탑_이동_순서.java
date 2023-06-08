package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 재귀
 * https://www.acmicpc.net/problem/11729
 */
public class BOJ_S1_11729_하노이_탑_이동_순서 {
    static int result = 0;
    static StringBuilder str = new StringBuilder();
    public static void backtracking(int N, int start, int mid, int to){
        // 마지막 원판
        if(N == 1){
            str.append(start + " " + to + "\n");
            result++;
            return;
        }
        // A->C 경우
        // N-1개를 A->B
        backtracking(N-1, start, to, mid);
        // 1개를 A->C
        str.append(start + " " + to + "\n");
        result++;
        // N-1개 B->C
        backtracking(N-1, mid, start, to);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N
        int N = Integer.parseInt(br.readLine());

        backtracking(N, 1, 2, 3);

        System.out.println(result);
        System.out.print(str);
        br.close();
    }
}
