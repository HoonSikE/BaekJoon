package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/6810
 */
public class BOJ_B4_6810_ISBN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int N = 3;
        StringBuilder num = new StringBuilder("9780921418");
        int result = 0;

        for (int n = 0; n < N; n++) {
            num.append(br.readLine());
        }

        for (int n = 0; n < num.length(); n++) {
            if(n%2==0)
                result += Character.getNumericValue(num.charAt(n));
            else
                result += Character.getNumericValue(num.charAt(n))*3;
        }

        str.append("The 1-3-sum is ").append(result);

        System.out.print(str);
        br.close();
    }
}
