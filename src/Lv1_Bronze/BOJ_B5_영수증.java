package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/25304
 */
public class BOJ_B5_영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 영수증 총 금액 X
        int X = Integer.parseInt(br.readLine());
        // 물건의 종류 수 N
        int N = Integer.parseInt(br.readLine());
        // 결과값
        int result = 0;

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            result += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        // 계산이 동일하면 Yes, 아니면 No
        str.append(X == result ? "Yes" : "No");

        br.close();
        System.out.print(str);
    }
}
