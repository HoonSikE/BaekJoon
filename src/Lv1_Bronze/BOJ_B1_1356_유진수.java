package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열, 브루트포스 알고리즘, 사칙연산
 * https://www.acmicpc.net/problem/1356
 */
public class BOJ_B1_1356_유진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String N = br.readLine();

        for (int n = 0; n < N.length(); n++){
            int tmp1 = 1;
            for (int m = 0; m < n+1; m++){
                tmp1 *= N.charAt(m) - '0';
            }
            int tmp2 = 1;
            for (int m = n+1; m < N.length(); m++){
                tmp2 *= N.charAt(m) - '0';
            }
            if(tmp1 == tmp2 && N.length() > 1){
                System.out.print("YES");
                return;
            }
        }
        str.append("NO");
        System.out.print(str);
        br.close();
    }
}
