package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/5358
 */
public class BOJ_B4_5358_Football_Team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        String s = br.readLine();

        while (s != null && !s.equals("")){
            String result = "";
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'I'){
                    result += "E";
                }else if(s.charAt(i) == 'i'){
                    result += "e";
                }else if(s.charAt(i) == 'E'){
                    result += "I";
                }else if(s.charAt(i) == 'e'){
                    result += "i";
                }else{
                    result += s.charAt(i);
                }
            }
            str.append(result).append("\n");
            s = br.readLine();
        }

        System.out.print(str);
        br.close();
    }
}
