package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 기하학
 * https://www.acmicpc.net/problem/1894
 */
public class BOJ_B1_1894_4번째_점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String tmp = br.readLine();

        while(tmp != null && !tmp.equals("")){
            // 각 줄은 8개의 실수
            st = new StringTokenizer(tmp, " ");
            // 첫 번째 변의 양 끝점의 x, y 좌표
            double x1 = Double.parseDouble(st.nextToken());
            double y1 = Double.parseDouble(st.nextToken());
            double x2 = Double.parseDouble(st.nextToken());
            double y2 = Double.parseDouble(st.nextToken());

            // 두 번째 변의 양 끝점의 x, y 좌표
            Double.parseDouble(st.nextToken());
            Double.parseDouble(st.nextToken());
            double x3 = Double.parseDouble(st.nextToken());
            double y3 = Double.parseDouble(st.nextToken());

            double x = 0.0;
            double y = 0.0;

            /**
             * 0 0
             * 0 1
             * 1 1
             * -> 1 0
             *
             * 1 0
             * 3.5 3.5
             * 0 1
             * -> -2.5 -2.5
             *
             * 1.866 0
             * 3.127
             * 3.543
             * 1.412 3.145
             * -> 0.151 -0.398
             */

            /**
             * 경우의 수 1: x 좌표가 같을 때
             */
            if(x1 == x2){
                x = x3;
            }else if(x2 == x3){
                x = x1;
            }

            /**
             * 경우의 수 2: y 좌표가 같을 때
             */
            if(y1 == y2){
                y = y3;
            }else if(y2 == y3){
                y = y1;
            }

            System.out.printf("%.3f %.3f\n", x, y);

            tmp = br.readLine();
        }

        br.close();
    }
}
