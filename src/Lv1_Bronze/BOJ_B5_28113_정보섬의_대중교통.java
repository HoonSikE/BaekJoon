package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/28113
 */
public class BOJ_B5_28113_정보섬의_대중교통 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(N <= B && B == A)
            str.append("Anything");
        else if(N <= B && B-A>0)
            str.append("Bus");
        else
            str.append("Subway");

        System.out.print(str);
        br.close();
    }
}
