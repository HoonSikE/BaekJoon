package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/26209
 */
public class BOJ_B5_26209_Intercepting_Information {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = 8;

        for (int n = 0; n < N; n++){
            int num = Integer.parseInt(st.nextToken());
            if(num!=0 && num!=1){
                System.out.print("F");
                return;
            }
        }

        str.append("S");

        System.out.print(str);
        br.close();
    }
}
