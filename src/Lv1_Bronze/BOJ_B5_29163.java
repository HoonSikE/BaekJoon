package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/29163
 */
public class BOJ_B5_29163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            int a = Integer.parseInt(st.nextToken());

            if(a%2==0){
                result++;
            }else{
                result--;
            }
        }

        if(result > 0)
            str.append("Happy");
        else
            str.append("Sad");

        System.out.print(str);
        br.close();
    }
}
