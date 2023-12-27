package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/2667
 */
public class BOJ_S1_2667_단지번호붙이기 {
    static int N;
    static char[][] map;
    static boolean[][] isVisited;
    // 상하좌우
    static int[] dCol = {-1, 1, 0, 0 };
    static int[] dRow = { 0, 0,-1, 1 };
    public static int bfs(int[] xy){
        int count = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(xy);

        while(!queue.isEmpty()){
            int[] start = queue.poll();

            // 상하좌우
            for(int i = 0; i < 4; i++){
                int nextY = start[0] + dCol[i];
                int nextX = start[1] + dRow[i];

                // 범위 체크
                if(nextY < 0 || nextY >= N || nextX < 0 || nextX >= N)
                    continue;

                // 0이거나 방문했다면 continue;
                if(map[nextY][nextX] == 0 || isVisited[nextY][nextX])
                    continue;

                // 방문 체크
                isVisited[nextY][nextX] = true;
                count++;
                queue.offer(new int[] {nextY, nextX});
            }
        }

        return count;
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

        for (int n = 0; n < N; n++){
            for (int m = 0; m < N; m++){
                // 0이거나 방문했다면 continue;
                if(map[n][m] == 0 || isVisited[n][m])
                    continue;

//                int num = bfs(new int[] {n, m});
//                if(num > 0){
                    str.append(bfs(new int[] {n, m})).append("\n");
//                }
                str.append("ddd" + n + "ddd" + m).append("\n");
            }
        }
        System.out.print(str);
        br.close();
    }
}
