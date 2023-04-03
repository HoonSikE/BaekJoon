package Lv3_Gold;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 누적 합
 * https://www.acmicpc.net/problem/10986
 */
public class BOJ_G3_10986_나머지_합 {
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
