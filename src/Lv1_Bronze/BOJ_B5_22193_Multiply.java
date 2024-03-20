package Lv1_Bronze;

import java.io.*;
import java.math.*;
import java.util.*;

/**
 * @author HanHoon
 * @category .
 * https://www.acmicpc.net/problem/.
 */
public class BOJ_B5_22193_Multiply {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String A = br.readLine();
        String B = br.readLine();

        str.append(new BigInteger(A).multiply(new BigInteger(B)));

        System.out.print(str);
        br.close();
    }
}
