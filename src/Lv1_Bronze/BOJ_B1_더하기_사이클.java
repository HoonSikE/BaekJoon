package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/3003
 */
public class BOJ_B1_더하기_사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        // 임시 숫자
        int tmp = N;
        // 사이클 길이
        int result = 0;

        while(true){
            result++;
            tmp = (tmp%10)*10 + (tmp/10 + tmp%10)%10;
            if(N==tmp)
                break;
        }
        str.append(result);
        br.close();
        System.out.print(str);
    }
}