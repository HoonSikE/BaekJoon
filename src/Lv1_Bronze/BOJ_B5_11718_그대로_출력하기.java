package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/11718
 */
public class BOJ_B5_11718_그대로_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            String tmp = br.readLine();
            if(tmp == null || tmp.isEmpty())
                break;
            str.append(tmp).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
