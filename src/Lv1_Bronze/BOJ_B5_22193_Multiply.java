package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

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
