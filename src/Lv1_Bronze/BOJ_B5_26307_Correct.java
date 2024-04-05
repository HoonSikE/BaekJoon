package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/26307
 */
public class BOJ_B5_26307_Correct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());

        str.append((HH-9)*60+MM);

        System.out.print(str);
        br.close();
    }
}
