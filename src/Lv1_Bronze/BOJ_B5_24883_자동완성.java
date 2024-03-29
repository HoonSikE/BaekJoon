package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/24883
 */
public class BOJ_B5_24883_자동완성 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        char c = br.readLine().charAt(0);

        if(c == 'N' || c == 'n')
            str.append("Naver D2");
        else
            str.append("Naver Whale");

        System.out.print(str);
        br.close();
    }
}
