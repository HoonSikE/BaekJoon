package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 확률론
 * https://www.acmicpc.net/problem/1404
 */
public class BOJ_S3_1404_토너먼트_승자 {
    static int N;
    static double[][] arr;
    static void backtracking(){

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        /**
         *        0
         *    0       4
         *  0   2   4   6
         * 0 1 2 3 4 5 6 7
         */
        N = 8;
        arr = new double[N][N];

        for (int n = 0; n < N; n++){
            for (int m = n+1; m < N; m++){
                // 확률이기때문에 100으로 나눠야한다.
                arr[n][m] = Double.parseDouble(st.nextToken())*0.01;
                arr[m][n] = 1 - arr[n][m];
            }
        }

        // 1차전
        double[] arr1 = new double[N];
        for (int n = 0; n < N; n++){
            // 1차전에서 이길 확률
            // 짝
            if(n%2 == 0){
                arr1[n] = arr[n][n+1];
            }
            // 홀
            else{
                arr1[n] = arr[n][n-1];
            }
        }

        // 2차전
        double[] arr2 = new double[N];
        for (int n = 0; n < N; n++){
            // 2차전에서 이길 확률
            if(n < 2){
                // 0, 1이 2,3에게 이길 확률
                arr2[n] = arr1[n] * arr[n][2] + arr1[n] * arr[n][3];
            }else if(n < 4){
                // 2, 3이 0,1에게 이길 확률
                arr2[n] = arr1[n] * arr[n][0] + arr1[n] * arr[n][1];
            }else if(n < 6){
                // 4, 5이 6,7에게 이길 확률
                arr2[n] = arr1[n] * arr[n][6] + arr1[n] * arr[n][7];
            }else if(n < 8){
                // 6, 7이 4,5에게 이길 확률
                arr2[n] = arr1[n] * arr[n][4] + arr1[n] * arr[n][5];
            }
        }

        // 3차전
        double[] arr3 = new double[N];
        for (int n = 0; n < N; n++){
            // 2차전에서 이길 확률
            if(n < 4){
                // 0,1,2,3가 4,5,6,7에게 이길 확률
                arr3[n] = arr2[n] * arr[n][4] + arr2[n] * arr[n][5]
                        + arr2[n] * arr[n][6] + arr2[n] * arr[n][7];
            }else if(n < 8){
                arr3[n] = arr2[n] * arr[n][0] + arr2[n] * arr[n][1]
                        + arr2[n] * arr[n][2] + arr2[n] * arr[n][3];
            }
        }

        for(double n : arr1){
            System.out.print(n + " ");
        }
        System.out.println();

        for(double n : arr2){
            System.out.print(n + " ");
        }
        System.out.println();

        for(double n : arr3){
            System.out.print(n + " ");
        }

        System.out.print(str);
        br.close();
    }
}
