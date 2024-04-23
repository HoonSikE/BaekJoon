package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/28235
 */
public class BOJ_B5_28235_코드마스터_2023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S = br.readLine();

        if(S.equals("SONGDO"))
            str.append("HIGHSCHOOL");
        else if(S.equals("CODE"))
            str.append("MASTER");
        else if(S.equals("2023"))
            str.append("0611");
        else if(S.equals("ALGORITHM"))
            str.append("CONTEST");

        System.out.print(str);
        br.close();
    }
}
