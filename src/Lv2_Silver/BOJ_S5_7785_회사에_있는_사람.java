package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 자료 구조, 해시를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/7785
 */
public class BOJ_S5_7785_회사에_있는_사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();

            if(value.equals("enter"))
                map.put(key, value);
            else if(value.equals("leave"))
                if(map.containsKey(key))
                    map.remove(key);
        }

        ArrayList<String> list = new ArrayList<String>(map.keySet());

        /**
         * reverse: 그냥 거꾸로
         * reverseOrder: 역순 정렬
         */
//        Collections.reverse(list);
        Collections.sort(list, Collections.reverseOrder());

        for(String s : list)
            str.append(s).append("\n");

        System.out.print(str);
        br.close();
    }
}
