package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2845
 */
public class BOJ_B4_2845_파티가_끝나고_난_뒤 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // L: 1m^2당 사람의 수, P: 파티장 넓이
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 5개의 신문사에 몇명만큼 잘못되어있는지 구하는 프로그램
        for (int n = 0; n < 5; n++)
            str.append(Integer.parseInt(st.nextToken())-(N*P)).append(" ");

        System.out.print(str);
        br.close();
    }
}
