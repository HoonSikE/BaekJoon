package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/27328
 */
public class BOJ_B5_27328_Three_Way_Comparison {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if(A < B)
            str.append(-1);
        else if(A==B)
            str.append(0);
        else if(A > B)
            str.append(1);

        System.out.print(str);
        br.close();
    }
}
