package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 기하학
 * https://www.acmicpc.net/problem/14215
 */
public class BOJ_B3_14215_세_막대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        int N = 3;

        while(N --> 0)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        if(list.get(0) + list.get(1) > list.get(2))
            str.append(list.get(0) + list.get(1) + list.get(2));
        else
            str.append((list.get(0) + list.get(1)) * 2 - 1);

        System.out.print(str);
        br.close();
    }
}
