package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/30087
 */
public class BOJ_B5_30087_진흥원_세미나 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();

        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");

        for (int n = 0; n < N; n++){
            str.append(map.get(br.readLine()) + "\n");
        }

        System.out.print(str);
        br.close();
    }
}
