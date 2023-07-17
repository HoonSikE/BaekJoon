package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1547
 */
public class BOJ_B3_1547_공 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int pre = 1;
        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(pre == a)
                pre = b;
            else if(pre == b)
                pre = a;
        }

        str.append(pre);

        System.out.print(str);
        br.close();
    }
}
