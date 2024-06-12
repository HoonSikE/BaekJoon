package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/6763
 */
public class BOJ_B4_6763_Speed_fines_are_not_fine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int L = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int tmp = S-L;

        if(tmp <= 0)
            str.append("Congratulations, you are within the speed limit!");
        else {
            str.append("You are speeding and your fine is $");

            if(tmp <= 20){
                str.append(100);
            }else if(tmp <= 30){
                str.append(270);
            }else{
                str.append(500);
            }
            str.append(".");

        }

        System.out.print(str);
        br.close();
    }
}
