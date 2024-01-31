package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2863
 */
public class BOJ_B3_2863_이게_분수 {
    static int n, result;
    static double max = Double.MIN_VALUE;
    static int[] arr;
    public static void rotation(){
        int tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[1];
        arr[1] = tmp;
        n++;
    }
    public static void getSum(){
        double sum = (double)(arr[0])/arr[2] + (double)(arr[1])/arr[3];

        if(max < sum){
            max = sum;
            result = n;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        arr = new int[4];
        n = 0;
        result = 0;

        for(int n = 0; n < 4; n += 2){
            st = new StringTokenizer(br.readLine());
            arr[n] = Integer.parseInt(st.nextToken());
            arr[n+1] = Integer.parseInt(st.nextToken());
        }

        getSum();
        for(int n = 0; n < 3; n++){
            rotation();
            getSum();
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
