package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 정수론, 중국인의 나머지 정리
 * https://www.acmicpc.net/problem/6064
 */
public class BOJ_S1_6064_카잉_달력 {
    static int M, N, x, y;
    public static int solution(){
        for (int num = x-1; num < (N * M); num += M) {
            if (num % N == y) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            str.append(solution()).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
