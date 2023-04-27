package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열
 * https://www.acmicpc.net/problem/2745
 */
public class BOJ_B2_2745_진법_변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int idx = 1;
        int result = 0;

        for(int i = N.length()-1; i >= 0; i--){
            char c = N.charAt(i);

            if('A' <= c && c <= 'Z')
                result += (c-'A'+10)*idx;
            else
                result += (c-'0')*idx;

            idx *= B;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
