package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/27889
 */
public class BOJ_B5_27889_특별한_학교_이름 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S = br.readLine();

        if(S.equals("NLCS"))
            str.append("North London Collegiate School");
        else if(S.equals("BHA"))
            str.append("Branksome Hall Asia");
        else if(S.equals("KIS"))
            str.append("Korea International School");
        else if(S.equals("SJA"))
            str.append("St. Johnsbury Academy");

        System.out.print(str);
        br.close();
    }
}
