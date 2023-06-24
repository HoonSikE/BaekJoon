package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category .
 * https://www.acmicpc.net/problem/9184
 */
public class BOJ_S2_9184_신나는_함수_실행 {
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
