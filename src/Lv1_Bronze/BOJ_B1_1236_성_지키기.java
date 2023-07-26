package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/1236
 */
public class BOJ_B1_1236_성_지키기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N, M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][M];

        int rowX = 0;
        for (int n = 0; n < N; n++){
            String s = br.readLine();
            map[n] = s.toCharArray();

            if(s.contains("X") == false)
                rowX++;
        }

        int colX = 0;
        for (int m = 0; m < M; m++){
            int cnt = 0;
            for (int n = 0; n < N; n++)
                if(map[n][m] == '.')
                    cnt++;
            if(cnt == N)
                colX++;
        }

        str.append(Math.max(rowX, colX));

        System.out.print(str);
        br.close();
    }
}
