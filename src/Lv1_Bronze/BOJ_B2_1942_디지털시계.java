package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열, 시뮬레이션, 파싱
 * https://www.acmicpc.net/problem/1942
 */
public class BOJ_B2_1942_디지털시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 3;

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine(), " ");
            String s1 = st.nextToken().replace(":", "");
            String s2 = st.nextToken().replace(":", "");

            str.append(s1).append("\n");
            str.append(s2).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
