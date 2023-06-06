package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/1076
 */
public class BOJ_B2_1076_저항 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();

        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        long result = 0;

        result += map.get(br.readLine()) * 10;
        result += map.get(br.readLine());

        int N = map.get(br.readLine());
        for(int i = 0; i < N; i++)
            result *= 10;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
