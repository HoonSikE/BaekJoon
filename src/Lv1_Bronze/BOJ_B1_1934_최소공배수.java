package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 정수론, 유클리드 호제법
 * https://www.acmicpc.net/problem/1934
 */
public class BOJ_B1_1934_최소공배수 {
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
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            str.append(A*B/gcd(A,B)).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
