package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1159
 */
public class BOJ_B2_1159_농구_경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int['z' - 'a' + 1];
        boolean flag = false;
        for (int n = 0; n < N; n++){
            String s = br.readLine();
            arr[s.charAt(0) - 'a']++;

            if(arr[s.charAt(0) - 'a'] >= 5)
                flag = true;
        }
        for(int i = 0; i < arr.length; i++)
            if(arr[i] >= 5)
                str.append((char)(i+'a'));

        if(!flag)
            str.append("PREDAJA");

        System.out.print(str);
        br.close();
    }
}
