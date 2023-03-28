package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 정수론, 유클리드 호제법
 * https://www.acmicpc.net/problem/1735
 */
public class BOJ_S3_1735_분수_합 {
    // 유클리드 호제법
    public static int gcd(int a, int b){
        // a > b인 경우에 실행
        if(a <= b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(b==0)
            return a;

        return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        int[] num = new int[4];
        for (int n = 0; n < 4; n=n+2){
            st = new StringTokenizer(br.readLine());
            num[n] = Integer.parseInt(st.nextToken());
            num[n+1] = Integer.parseInt(st.nextToken());
        }

        int a = num[0]*num[3] + num[1]*num[2];
        int b = num[1]*num[3];

        int mod = gcd(a, b);
        a /= mod;
        b /= mod;

        str.append(a+" "+b);

        System.out.print(str);
        br.close();
    }
}
