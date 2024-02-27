package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/15680
 */
public class BOJ_B5_15680_연세대학교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        if(N==0){
            str.append("YONSEI");
        }else if(N==1){
            str.append("Leading the Way to the Future");
        }

        System.out.print(str);
        br.close();
    }
}
