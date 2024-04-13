package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/27294
 */
public class BOJ_B5_27294_몇개고 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        // 점심시간이 아니거나 술하고 같이 초밥을 먹을 때 280
        if((T < 12 || 16 < T) || S ==1)
            str.append(280);
        // 점심식사이면서 술과 같이 먹지 않을 때 320
        else
            str.append(320);

        System.out.print(str);
        br.close();
    }
}
