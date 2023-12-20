package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/5357
 */
public class BOJ_B4_5357_Dedupe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            char[] arr = br.readLine().toCharArray();
            String result = String.valueOf(arr[0]);

            for(int i = 1; i < arr.length; i++){
                if((arr[i]) != result.charAt(result.length()-1))
                    result += arr[i];
            }
            str.append(result).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
