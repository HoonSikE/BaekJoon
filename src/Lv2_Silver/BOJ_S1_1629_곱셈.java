package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 분할정복을 이용한 거듭제곱
 * https://www.acmicpc.net/problem/1629
 */
public class BOJ_S1_1629_곱셈 {
    public static long pow(long A, long B, long C){
        if(B == 1)
            return A%C;

        // B번 거듭제곱하지 않고 절반씩 계산해서 분할정복한다.
        long tmp = pow(A, B/2, C);

        long result = tmp*tmp%C;

        if(B%2 == 0)
            return result;

        return result*A%C;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // A, B, C
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        str.append(pow(A,B,C));

        System.out.print(str);
        br.close();
    }
}
