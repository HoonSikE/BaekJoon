package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1362
 */
public class BOJ_B2_1362_펫 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // o:적정 체중, w: 실제 체중
        int o = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int t = 1;

        while(true){
            st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            if(action.equals("0") && n == 0)
                break;

            if(action.equals("#") && n == 0) {
                str.append(t + " ");

                str.append(":-)\n");
                str.append(":-(\n");
                str.append("RIP\n");
                break;
            }
        }
        System.out.print(str);
        br.close();
    }
}
