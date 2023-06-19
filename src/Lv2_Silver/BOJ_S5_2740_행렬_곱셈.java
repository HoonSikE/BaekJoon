package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 선형대수학
 * https://www.acmicpc.net/problem/2740
 */
public class BOJ_S5_2740_행렬_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 행렬 A
        int nA = Integer.parseInt(st.nextToken());
        int mA = Integer.parseInt(st.nextToken());
        int[][] arrA = new int[nA][mA];

        for(int n = 0; n < nA; n++){
            st = new StringTokenizer(br.readLine());
            for(int m = 0; m < mA; m++){
                arrA[n][m] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 B
        st = new StringTokenizer(br.readLine());
        int nB = Integer.parseInt(st.nextToken());
        int mB = Integer.parseInt(st.nextToken());
        int[][] arrB = new int[nB][mB];

        for(int n = 0; n < nB; n++){
            st = new StringTokenizer(br.readLine());
            for(int m = 0; m < mB; m++){
                arrB[n][m] = Integer.parseInt(st.nextToken());
            }
        }

        // 곰셈
        for(int na = 0; na < nA; na++){
            for(int mb = 0; mb < mB; mb++){
                int sum = 0;
                for(int ma = 0; ma < mA; ma++){
                    sum += arrA[na][ma] * arrB[ma][mb];
                }
                str.append(sum).append(" ");
            }
            str.append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
