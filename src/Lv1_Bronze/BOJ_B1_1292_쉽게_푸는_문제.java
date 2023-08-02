package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/1292
 */
public class BOJ_B1_1292_쉽게_푸는_문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int n = 1;
        int idx = 1;
        int result = 0;
        while(idx <= B){
            for(int i = 0; i < n; i++){
                if(A <= idx && idx <= B)
                    result += n;
                idx++;
            }
            n++;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
