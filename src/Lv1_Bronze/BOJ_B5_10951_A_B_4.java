package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/10951
 */
public class BOJ_B5_10951_A_B_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        String tmp;

        while((tmp = br.readLine()) != null){
            st = new StringTokenizer(tmp, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            str.append(A+B).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
