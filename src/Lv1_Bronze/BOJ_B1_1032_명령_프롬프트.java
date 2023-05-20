package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1032
 */
public class BOJ_B1_1032_명령_프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        // 이름의 길이는 모두 같고 길이는 최대 50이다.
        for (int n = 0; n < N; n++)
            arr[n] = br.readLine();

        String result = "";

        for(int i = 0; i < arr[0].length(); i++){
            char c = arr[0].charAt(i);
            boolean flag = true;

            for(int n = 1; n < arr.length; n++){
                if(c != arr[n].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag)
                result += c;
            else
                result += "?";
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
