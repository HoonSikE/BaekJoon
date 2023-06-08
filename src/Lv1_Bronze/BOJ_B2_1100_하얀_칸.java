package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1100
 */
public class BOJ_B2_1100_하얀_칸 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        int N = 8;
        int result = 0;

        for (int n = 0; n < N; n++){
            char[] arr = br.readLine().toCharArray();
            if(n%2 == 0) {
                for (int i = 0; i < arr.length; i += 2)
                    if (arr[i] == 'F')
                        result++;
            } else {
                for (int i = 1; i < arr.length; i += 2)
                    if (arr[i] == 'F')
                        result++;
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
