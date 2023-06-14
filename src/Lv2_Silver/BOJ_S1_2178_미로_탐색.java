package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색
 * https://www.acmicpc.net/problem/2178
 */
public class BOJ_S1_2178_미로_탐색 {
    static int N, M;
    static int[][] map;
    static boolean[][] isVisited;
    public static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0,0});
        isVisited[0][0] = true;

        // 상하좌우
        int[] dCol = {-1, 1, 0, 0};
        int[] dRow = { 0, 0,-1, 1};

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            int currentY = now[0];
            int currentX = now[1];

            // 상하좌우
            for(int i = 0; i < 4; i++){
                int nextY = currentY + dCol[i];
                int nextX = currentX + dRow[i];

                // 범위 체크
                if(nextY >= N || nextY < 0 || nextX >= M || nextX < 0)
                    continue;
                // 간던 곳인지, 길인지 체크
                if(isVisited[nextY][nextX] || map[nextY][nextX] == 0)
                    continue;

                queue.offer(new int[] {nextY, nextX});
                map[nextY][nextX] = map[currentY][currentX] + 1;
                isVisited[nextY][nextX] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        isVisited = new boolean[N][M];

        for (int n = 0; n < N; n++){
            String s = br.readLine();
            for(int m = 0; m < M; m++)
                map[n][m] = s.charAt(m) - '0';
        }

        bfs();

        str.append(map[N-1][M-1]);

        System.out.print(str);
        br.close();
    }
}
