package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 정수론, 유클리드 호제법
 * https://www.acmicpc.net/problem/13241
 */
public class BOJ_S5_13241_최소공배수 {
    // 유클리드 호제법
    public static long gcd(long a, long b){
        if(a < b){
            long tmp = a;
            a = b;
            b = tmp;
        }
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 두 정수 A, B (입력 크기가 크다)
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        str.append(A*B/gcd(A,B));

        System.out.print(str);
        br.close();
    }
}
