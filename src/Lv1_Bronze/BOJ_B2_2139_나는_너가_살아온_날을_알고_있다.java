package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2139
 */
public class BOJ_B2_2139_나는_너가_살아온_날을_알고_있다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());

            int D = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if(D==0 && M==0 && Y==0)
                break;

            // 4로 나눠떨어지고, 100으로 나누어떨어지지 않으며 X, 400으로 나누어 떨어지는 년도 포함 O
            boolean isLeap = false;
            if((Y%4 == 0 && Y%100 != 0) || Y%400 == 0){
                isLeap = true;
            }

            int[] arr = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            if (isLeap)
                arr = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            int result = 0;

            for(int n = 0; n < M-1; n++){
                result += arr[n];
            }

            result += D;

            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
