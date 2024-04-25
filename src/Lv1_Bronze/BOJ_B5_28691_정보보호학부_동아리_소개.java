package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/28691
 */
public class BOJ_B5_28691_정보보호학부_동아리_소개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S = br.readLine();

        switch (S){
            case "M":
                str.append("MatKor");
                break;
            case "W":
                str.append("WiCys");
                break;
            case "C":
                str.append("CyKor");
                break;
            case "A":
                str.append("AlKor");
                break;
            case "$":
                str.append("$clear");
                break;
        }
        System.out.print(str);
        br.close();
    }
}
