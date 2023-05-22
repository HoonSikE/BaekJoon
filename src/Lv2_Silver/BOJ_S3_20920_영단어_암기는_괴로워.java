package Lv2_Silver;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author HanHoon
 * @category 자료 구조, 문자열, 정렬, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/.
 */
public class BOJ_S3_20920_영단어_암기는_괴로워 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int n = 0; n < N; n++){
            String s = br.readLine();
            if(s.length() < M)
                continue;

            int cnt = map.getOrDefault(s, 0);
            map.put(s, cnt+1);
        }

        /**
         * map.keySet()
         *     .stream()
         * //    .map(String::toLowerCase)
         * //    .map(i -> i * 10) // 이런식으로 문자를 소문자로 바꾸거나 연산수행도 가능
         * //    .sorted() // 정렬
         * //    .filter(i -> i >= 30) // 30이상인 데이터만 추출
         *     .collect(Collectors.toList());
         */
//        List<String> list = map.keySet().stream().collect(Collectors.toList());
        List<String> list = new ArrayList(map.keySet());
//        List<String> list = new ArrayList(map.values());

        list.sort((o1, o2) ->{
            int c1 = map.get(o1);
            int c2 = map.get(o2);

            if(c1 == c2){
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o2.length() - o1.length();
            }
            return c2 - c1;
        });

        for(String word : list)
            str.append(word).append("\n");

        System.out.print(str);
        br.close();
    }
}
