package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2667
 */
public class BOJ_S1_2667_단지번호붙이기 {
    static int N, count;
    static char[][] map;
    static boolean[][] isVisited;
    // 상하좌우
    static int[] dCol = {-1, 1, 0, 0 };
    static int[] dRow = { 0, 0,-1, 1 };
    public static void dfs(int y, int x){
        // 상하좌우
        for(int i = 0; i < 4; i++){
            int nextY = y + dCol[i];
            int nextX = x + dRow[i];

            // 범위 체크
            if(nextY < 0 || nextY >= N || nextX < 0 || nextX >= N)
                continue;

            // 0이거나 방문했다면 continue;
            if(map[nextY][nextX] == '0' || isVisited[nextY][nextX])
                continue;

            // 방문 체크
            isVisited[nextY][nextX] = true;
            count++;
            dfs(nextY, nextX);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        N = Integer.parseInt(br.readLine());

        map = new char[N][N];
        isVisited = new boolean[N][N];

        for (int n = 0; n < N; n++){
            map[n] = br.readLine().toCharArray();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int n = 0; n < N; n++){
            for (int m = 0; m < N; m++){
                // 0이거나 방문했다면 continue;
                if(map[n][m] == '0' || isVisited[n][m])
                    continue;
                count = 1;
                isVisited[n][m] = true;
                dfs(n, m);
                list.add(count);
            }
        }

        Collections.sort(list);

        str.append(list.size()).append("\n");

        for(int num : list){
            str.append(num).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
