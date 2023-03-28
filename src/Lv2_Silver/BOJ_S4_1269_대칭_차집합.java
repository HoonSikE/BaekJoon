package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 자료 구조, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/1269
 */
public class BOJ_S4_1269_대칭_차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // A의 원소 개수
        int aSize = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> A = new HashMap<>();

        // B의 원소 개수
        int bSize = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> B = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++)
            A.put(Integer.parseInt(st.nextToken()), i);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++)
            B.put(Integer.parseInt(st.nextToken()), i);

        int result = 0;

        for(int n : A.keySet())
            if(!B.containsKey(n))
                result++;

        for(int n : B.keySet())
            if(!A.containsKey(n))
                result++;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
