import java.io.*;
import java.util.*;

class Pair{
    int y;
    int x;
    public Pair(int y, int x){
        this.y = y;
        this.x = x;
    }
}
public class Test {
    static int w, h;
    static int[][] map;
    static boolean[][] isVisit;

    // 상, 우상, 우, 우하, 하, 좌하, 좌, 좌상
    static int[] dCol = { 1, 1, 0,-1,-1,-1, 0, 1 };
    static int[] dRow = { 0, 1, 1, 1, 0,-1,-1,-1 };

    public static void dfs(int y, int x){
        // 방문 표시
        isVisit[y][x] = true;

        // 8방 탐색 시작
        for(int i = 0 ; i < 8; i++){
            int tmpY = y + dCol[i];
            int tmpX = x + dRow[i];

            // 범위 초과 확인
            if(tmpY < 0 || tmpY >= h || tmpX < 0 || tmpX >= w)
                break;

            // 땅이 존재하고 방문하지 않않았다면 깊이 탐색 진행
            if(map[tmpY][tmpX] == 1 && !isVisit[tmpY][tmpX])
                dfs(tmpY, tmpX);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w==0&&h==0)
                break;

            map = new int[h][w];
            isVisit = new boolean[h][w];
            int cnt = 0;

            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    // 방문하지 않은 && 섬이라면
                    if(!isVisit[i][j] && map[i][j]==1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            str.append(cnt).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
