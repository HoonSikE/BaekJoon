package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열, 애드 훅
 * https://www.acmicpc.net/problem/3765
 */
public class BOJ_B4_3765_Celebrity_jeopardy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            String s = br.readLine();
            if(s == null || s.equals(""))
                break;
            str.append(s).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
