package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/1703
 */
public class BOJ_B3_1703_생장점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            if(A == 0)
                break;

            int result = 1;
            for(int a = 0; a < 2*A; a++){
                int n = Integer.parseInt(st.nextToken());
                // 생잠점
                if(a%2 == 0)
                    result *= n;
                // 가지치기 수
                else
                    result -= n;
            }
            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
