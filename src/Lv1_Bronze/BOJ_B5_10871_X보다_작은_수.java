package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10871
 */
public class BOJ_B5_10871_X보다_작은_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N과 X
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp < X)
                str.append(tmp).append(" ");
        }

        System.out.print(str);
        br.close();
    }
}
