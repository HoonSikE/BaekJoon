package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/26069
 */
public class BOJ_S4_26069_붙임성_좋은_총총이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if(set.contains(s1))
                set.add(s2);
            else if(set.contains(s2))
                set.add(s1);
        }

        str.append(set.size());

        System.out.print(str);
        br.close();
    }
}
