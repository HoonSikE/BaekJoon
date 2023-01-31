package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 분할 정복, 재귀
 * https://www.acmicpc.net/problem/2447
 */
public class BOJ_G5_2447_별_찍기 {
    public static int N;
    public static String[] pt = {"   ", "* *", "***"};
    public static String[] result = new String[N];
    public static void backtracking(int N){

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        N = Integer.parseInt(br.readLine());

        backtracking(N);

        str.append(0);

        System.out.print(str);
        br.close();
    }
}
