package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열
 * https://www.acmicpc.net/problem/1225
 */
public class BOJ_B2_1225_이상한_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        String A = st.nextToken();
        String B = st.nextToken();
        long result = 0;

        for(int a = 0; a < A.length(); a++){
            for(int b = 0; b < B.length(); b++) {
                result += (A.charAt(a) -'0') * (B.charAt(b) -'0');
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
