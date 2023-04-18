package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 기하학
 * https://www.acmicpc.net/problem/14215
 */
public class BOJ_B3_14215_세_막대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            Integer.parseInt(br.readLine());
        }
        System.out.print(str);
        br.close();
    }
}
