package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/1284
 */
public class BOJ_B3_1284_집_주소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            String s = br.readLine();
            int result = 1;

            if(s.equals("0"))
                break;

            for(char c : s.toCharArray()){
                switch(c){
                    case '1':
                        result += 3;
                        break;
                    case '0':
                        result += 5;
                        break;
                    default:
                        result += 4;
                        break;
                }
            }
            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
