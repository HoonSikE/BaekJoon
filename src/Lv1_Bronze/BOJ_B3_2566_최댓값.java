package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2566
 */
public class BOJ_B3_2566_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int idxY = 0;
        int idxX = 0;

        for (int i = 1; i <= 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 9; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(max < tmp) {
                    max = tmp;
                    idxY = i;
                    idxX = j;
                }
            }
        }

        str.append(max).append("\n");
        str.append(idxY).append(" ").append(idxX);

        System.out.print(str);
        br.close();
    }
}
