package Lv2_Silver;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/4673
 */
public class BOJ_S5_4673_셀프_넘버 {
    public static int d(int n){
        int sum = n;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        boolean[] arr = new boolean[10001];
        for(int i = 1; i < arr.length; i++){
            int n = d(i);
            if(n < 10001)
                arr[n] = true;
        }

        for(int i = 1; i < arr.length; i++)
            if(!arr[i])
                str.append(i).append("\n");

        System.out.print(str);
        br.close();
    }
}
