package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 문자열, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/11478
 */
public class BOJ_S3_11478_서로_다른_문자열의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // S: 문자열 S
        String S = br.readLine();
        HashMap<String, Character> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++)
            for (int j = i+1; j <= S.length(); j++)
                map.put(S.substring(i,j), ' ');

        str.append(map.size());

        System.out.print(str);
        br.close();
    }
}
