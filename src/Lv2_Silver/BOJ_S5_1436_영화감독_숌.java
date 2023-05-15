package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1436
 */
public class BOJ_S5_1436_영화감독_숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int cnt = 1;

        while(cnt != N) {
            num++;
            if(String.valueOf(num).contains("666"))
                cnt++;
        }

        str.append(num);

        System.out.print(str);
        br.close();
    }
}
