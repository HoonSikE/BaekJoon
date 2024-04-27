package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/28927
 */
public class BOJ_B5_28927_KNHOMaHbl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 2;
        int[] arr = new int[2];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            arr[n] = 3*t+20*e+120*f;
        }

        if(arr[0] > arr[1])
            str.append("Max");
        else if(arr[0] < arr[1])
            str.append("Mel");
        else if(arr[0] == arr[1])
            str.append("Draw");

        System.out.print(str);
        br.close();
    }
}
