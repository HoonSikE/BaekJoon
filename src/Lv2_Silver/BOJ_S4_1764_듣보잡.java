package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 문자열, 정렬, 해시를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/1764
 */
public class BOJ_S4_1764_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder str = new StringBuilder();

        // N: 듣도 못한 수
        int N = Integer.parseInt(st.nextToken());
        // M: 보도 못한 수
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,Character> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (int n = 0; n < N; n++)
            map.put(br.readLine(), ' ');

        for (int m = 0; m < M; m++) {
            String tmp = br.readLine();
            if(map.containsKey(tmp))
                list.add(tmp);
        }

        Collections.sort(list);

        str.append(list.size()).append("\n");
        for(String s : list)
            str.append(s).append("\n");

        System.out.print(str);
        br.close();
    }
}
