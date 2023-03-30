package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category .
 * https://www.acmicpc.net/problem/5086
 */
public class BOJ_B3_5086_배수와_약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0)
                break;

            if(B%A == 0)
                str.append("factor\n");
            else if(A%B == 0)
                str.append("multiple\n");
            else
                str.append("neither\n");
        }
        System.out.print(str);
        br.close();
    }
}
