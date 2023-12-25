package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 그래프 이론, 그래프 탐색, 최단 경로, 플로이드-워셜
 * https://www.acmicpc.net/problem/11403
 */
public class BOJ_S1_11403_경로_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

//        // N
//        int N = Integer.parseInt(br.readLine());
//
//        for (int n = 0; n < N; n++){
//            st = new StringTokenizer(br.readLine());
//            Integer.parseInt(st.nextToken());
//            Integer.parseInt(br.readLine());
//        }
//
//        int N = Integer.parseInt(br.readLine());
//        int[][] arr = new int[N][N];
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < N; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        // i에서 j까지 갈 수 있는가?
//        // i에서 k로 가고, k에서 j로 갈 수 있는가?
//        // 위에 2개의 질문은 동일함.
//        for (int k = 0; k < N; k++) {
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    // 단순히 갈 수 있는 경로가 있는지만 체크함.
//                    if (arr[i][k] == 1 && arr[k][j] == 1) {
//                        arr[i][j] = 1;
//                    }
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < N; i++) {
//            for(int j = 0; j < N; j++) {
//                sb.append(arr[i][j] + " ");
//            }
//            sb.append("\n");
//        }

        System.out.print(str);
        br.close();
    }
}
