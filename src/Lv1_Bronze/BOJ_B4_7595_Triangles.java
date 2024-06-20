package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/7595
 */
public class BOJ_B4_7595_Triangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        while (true) {
            if(N==0)
                break;

            for(int n = 1; n <= N; n++){
                for(int m = 0; m < n; m++){
                    str.append("*");
                }
                str.append("\n");
            }
            N = Integer.parseInt(br.readLine());
        }

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            Integer.parseInt(br.readLine());
        }
        System.out.print(str);
        br.close();
    }
}
