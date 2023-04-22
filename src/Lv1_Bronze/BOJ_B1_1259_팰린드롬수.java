package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1259
 */
public class BOJ_B1_1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            String num = br.readLine();
            if(num.equals("0"))
                break;

            boolean flag = true;
            for(int i = 0; i < num.length()/2; i ++){
                if(num.charAt(i) != num.charAt(num.length()-1 - i)){
                    flag = false;
                    break;
                }
            }
            if(flag)
                str.append("yes\n");
            else
                str.append("no\n");
        }

        System.out.print(str);
        br.close();
    }
}
