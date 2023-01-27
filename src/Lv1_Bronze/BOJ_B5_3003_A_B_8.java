package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/3003
 */
public class BOJ_B5_3003_A_B_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            str.append("Case #").append(i).append(": ")
                    .append(A).append(" + ").append(B).append(" = ").append(A+B + "\n");
        }
        br.close();
        System.out.print(str);
    }
}
