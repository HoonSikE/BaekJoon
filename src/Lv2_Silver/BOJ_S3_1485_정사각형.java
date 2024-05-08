package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 정렬, 기하학
 * https://www.acmicpc.net/problem/1485
 */
public class BOJ_S3_1485_정사각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            for(int i = 0; i < 4; i++){
                st = new StringTokenizer(br.readLine());
                Integer.parseInt(st.nextToken());
                Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(str);
        br.close();
    }
}
