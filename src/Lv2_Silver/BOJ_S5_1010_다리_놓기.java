package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 다이나믹 프로그래밍, 조합론
 * https://www.acmicpc.net/problem/1010
 */
public class BOJ_S5_1010_다리_놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
        }
        System.out.print(str);
        br.close();
    }
}
