package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/1996
 */
public class BOJ_S5_1996_지뢰_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];

        // 좌상, 상, 우상, 좌, 우, 좌하, 하, 우하
        int[] col = {-1,-1,-1, 0, 0, 1, 1, 1};
        int[] row = {-1, 0, 1,-1, 1,-1, 0, 1};

        for (int n = 0; n < N; n++){
            String S = br.readLine();
            for (int m = 0; m < S.length(); m++){
                if(S.charAt(m) != '.'){
                    map[n][m] = -1;
                    // 8방 탐색
                    for(int i = 0; i < 8; i++){
                        int y = n+col[i];
                        int x = m+row[i];
                        // 범위 체크 및 지뢰 위치인지 판별
                        if(y < 0 || y >= N || x < 0 || x >= N || map[y][x] == -1)
                            continue;
                        map[y][x] += S.charAt(m)-'0';
                    }
                }
            }
        }

        for (int n = 0; n < N; n++){
            for (int m = 0; m < N; m++){
                if(map[n][m] == -1){
                    str.append("*");
                }else if(map[n][m] >= 10) {
                    str.append("M");
                }else{
                    str.append(map[n][m]);
                }
            }
            str.append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
