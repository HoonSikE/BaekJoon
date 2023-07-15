package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/5341
 */
public class BOJ_B5_5341_Pyramids {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0)
                break;

            int result = 0;
            for(int n = N; n > 0; n--)
                result += n;

            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
