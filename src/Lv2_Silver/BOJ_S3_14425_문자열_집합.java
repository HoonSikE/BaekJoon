package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 문자열, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/14425
 */
public class BOJ_S3_14425_문자열_집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 포함되어 있는 문자열 수
        int N = Integer.parseInt(st.nextToken());
        // M: 검사해야하는 문자열 수
        int M = Integer.parseInt(st.nextToken());

        // 중복 테스트를 위한 문자열 집합 S
        HashMap<String, Character> S = new HashMap<>();
        for (int n = 0; n < N; n++)
            S.put(br.readLine(), ' ');

        int result = 0;
        for (int m = 0; m < M; m++)
            // 값이 존재한다면 개수 증가
            if(S.containsKey(br.readLine()))
                result++;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
