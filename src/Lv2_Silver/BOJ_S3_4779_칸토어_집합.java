package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 분할 정복, 재귄
 * https://www.acmicpc.net/problem/4779
 */
public class BOJ_S3_4779_칸토어_집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            Integer.parseInt(br.readLine());
        }
        System.out.print(str);
        br.close();
    }
}
