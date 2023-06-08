package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 * https://www.acmicpc.net/problem/1012
 */
class Position{
    int x;
    int y;
    Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BOJ_S2_1012_유기농_배추 {
    static int M, N;
    static int[][] map;
    static boolean[][] isVisited;
    // 상하좌우
    static int[] dCol = {-1, 1, 0, 0};
    static int[] dRow = { 0, 0,-1, 1};

    /**
     *  isVisited 방문 체크를 Queue에 넣을 때 해줘야 메모리 초과가 나지 않는다.
     *  뺄 때 하면 peek() 때문에 Queue에 메모리 초과 발생
     */
    public static void bfs(int x, int y){
        Queue<Position> queue = new LinkedList<>();
        isVisited[x][y] = true;
        queue.add(new Position(x, y));

        while(!queue.isEmpty()){
            int currentX = queue.peek().x;
            int currentY = queue.peek().y;
            queue.poll();

            for(int i = 0; i < 4; i++){
                int nextX = currentX + dRow[i];
                int nextY = currentY + dCol[i];

                if(nextX < 0 || nextX >= M || nextY < 0 || nextY >= N || map[nextX][nextY] != 1 || isVisited[nextX][nextY])
                    continue;
                isVisited[nextX][nextY] = true;

                queue.offer(new Position(nextX, nextY));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
            st = new StringTokenizer(br.readLine());
            // M: 가로 길이, N: 세로 길이, K: 심어진 위치 개수
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            isVisited = new boolean[M][N];

            for(int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int result = 0;
            for(int m = 0; m < M; m++){
                for(int n = 0; n < N; n++){
                    if(map[m][n] == 1 && !isVisited[m][n]){
                        bfs(m, n);
                        result++;
                    }
                }
            }
            str.append(result).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
