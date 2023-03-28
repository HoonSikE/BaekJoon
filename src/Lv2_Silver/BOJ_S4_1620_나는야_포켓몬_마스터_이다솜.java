package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 해시를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/1620
 */
public class BOJ_S4_1620_나는야_포켓몬_마스터_이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 포켓몬 개수
        int N = Integer.parseInt(st.nextToken());
        // M: 맞춰야 하는 문제의 개수
        int M = Integer.parseInt(st.nextToken());

        // 도감
        HashMap<String,Integer> map = new HashMap<>();
        String[] arr = new String[N+1];

        for (int n = 1; n <= N; n++){
            String tmp = br.readLine();
            map.put(tmp, n);
            arr[n] = tmp;
        }


        for (int m = 0; m < M; m++){
            String tmp = br.readLine();
            // key값으로 value값 반환
            if(map.containsKey(tmp))
                str.append(map.get(tmp)).append("\n");
            else
                str.append(arr[Integer.parseInt(tmp)]).append("\n");
            // value값으로 key값 반환 시간초과 발생
            /*else
                for(String key : map.keySet())
                    if(Integer.parseInt(tmp) == map.get(key))
                        str.append(key).append("\n");*/
        }
        System.out.print(str);
        br.close();
    }
}
