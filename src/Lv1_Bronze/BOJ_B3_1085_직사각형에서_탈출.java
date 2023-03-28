package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 기하학
 * https://www.acmicpc.net/problem/1085
 */
public class BOJ_B3_1085_직사각형에서_탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        min = Math.min(x, w-x);
        min = Math.min(min, y);
        min = Math.min(min, h-y);
        
        str.append(min);

        System.out.print(str);
        br.close();
    }
}
