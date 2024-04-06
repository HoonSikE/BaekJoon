package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/26489
 */
public class BOJ_B5_26489_Gum_Gum_for_Jay_Jay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int result = 0;
        String S = br.readLine();

        while(S != null && !S.equals("")){
            result++;
            S = br.readLine();
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
