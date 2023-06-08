package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1264
 */
public class BOJ_B4_1264_모음의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            String s = br.readLine();
            int result = 0;

            if(s.equals("#"))
                break;

            for(char c : s.toCharArray())
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
                    || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                    result++;

            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
