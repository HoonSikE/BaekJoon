package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/1547
 */
public class BOJ_B1_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 과목 개수 N
        int N = Integer.parseInt(br.readLine());
        // 과목 점수
        double[] arr = new double[N];
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        double sum = 0;
        for(double i : arr)
            sum += (i/arr[arr.length-1])*100;

        str.append(sum/arr.length);

        System.out.print(str);
        br.close();
    }
}
