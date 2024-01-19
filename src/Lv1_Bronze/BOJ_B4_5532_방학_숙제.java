package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/5532
 */
public class BOJ_B4_5532_방학_숙제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        double result = 0;

        result = Math.max((double)A/(double)C, (double)B/(double)D);
        result = Math.ceil(result);

        result = L - (int) result;

        str.append((int)result);

        System.out.print(str);
        br.close();
    }
}
