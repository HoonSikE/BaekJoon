package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/25192
 */
public class BOJ_S4_25192_인사성_밝은_곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int ans = 0;

        for (int n = 0; n < N; n++){
            String s = br.readLine();
            if(s.equals("ENTER")) {
                set.clear();
                continue;
            }
            if(!set.contains(s)){
                set.add(s);
                ans++;
            }
        }

        str.append(ans);

        System.out.print(str);
        br.close();
    }
}
