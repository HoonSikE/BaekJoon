package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/2869
 */
public class BOJ_B1_2869_달팽이는_올라가고_싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // A: 낮에 A미터 올라갈 수 있다.
        int A = Integer.parseInt(st.nextToken());
        // B: 밤에 B미터 미끄러진다.
        int B = Integer.parseInt(st.nextToken());
        // V: 높이가 V미터 나무막대.
        int V = Integer.parseInt(st.nextToken());

        int day = (V-B)/(A-B);

        if((V-B)%(A-B)!=0)
            day++;

        str.append(day);

        System.out.print(str);
        br.close();
    }
}
