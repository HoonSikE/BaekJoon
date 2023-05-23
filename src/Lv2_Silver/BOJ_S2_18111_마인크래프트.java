package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/18111
 */
public class BOJ_S2_18111_마인크래프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 세로, M: 가로
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // B: 블록
        int B = Integer.parseInt(st.nextToken());

        /**
         * 가장 위에 있는 블록을 제거하여 인벤토리에 넣는 작업 = 2초
         * 인벤토리에서 블록 하나를 꺼내서 좌표의 가장 위에 있는 블록 위에 놓는 작업 = 1초
         */
        int[][] arr = new int[N][M];
        // 최소, 최대 높이
        int min = 256;
        int max = 0;

        // 블럭 저장
        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            for (int m = 0; m < M; m++) {
                arr[n][m] = Integer.parseInt(st.nextToken());

                if(min > arr[n][m])
                    min = arr[n][m];
                if(max < arr[n][m])
                    max = arr[n][m];
            }
        }

        int time = Integer.MAX_VALUE;
        int high = 0;

        // 높이
        for(int n = min; n <= max; n++){
            int cnt = 0;
            int block = B;

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    // 높으면 블록을 인벤토리에 넣는다.
                    if(n < arr[i][j]){
                        cnt += (arr[i][j] - n) * 2;
                        block += arr[i][j] - n;
                    // 낮으면 블록을 쌓는다.
                    }else{
                        cnt += n - arr[i][j];
                        block -= n - arr[i][j];
                    }
                }
            }

            // 블록을 다 사용하면 반복문 종료
            if(block < 0)
                break;

            if(time >= cnt){
                time = cnt;
                high = n;
            }
        }

        str.append(time + " " + high);

        System.out.print(str);
        br.close();
    }
}
