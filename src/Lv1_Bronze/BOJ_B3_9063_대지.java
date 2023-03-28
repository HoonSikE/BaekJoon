package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 기하학
 * https://www.acmicpc.net/problem/9063
 */
public class BOJ_B3_9063_대지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N: 점의 개수
        int N = Integer.parseInt(br.readLine());

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            minX = minX > x ? x : minX;
            maxX = maxX < x ? x : maxX;
            int y = Integer.parseInt(st.nextToken());
            minY = minY > y ? y : minY;
            maxY = maxY < y ? y : maxY;
        }
        str.append((maxY-minY)*(maxX-minX));

        System.out.print(str);
        br.close();
    }
}
