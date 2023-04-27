package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 기하학
 * https://www.acmicpc.net/problem/10101
 */
public class BOJ_B4_10101_삼각형_외우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // A
        int A = Integer.parseInt(br.readLine());
        // B
        int B = Integer.parseInt(br.readLine());
        // C
        int C = Integer.parseInt(br.readLine());

        if(A == 60 && B == 60 && C == 60)
            str.append("Equilateral");
        else if(A+B+C == 180)
            if(A==B || A==C || C==B)
                str.append("Isosceles");
            else
                str.append("Scalene");
        else
            str.append("Error");

        System.out.print(str);
        br.close();
    }
}
