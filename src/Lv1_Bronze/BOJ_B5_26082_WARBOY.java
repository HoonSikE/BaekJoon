package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/26082
 */
public class BOJ_B5_26082_WARBOY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        /**
         * 경쟁사 가격대비 성능 = B/A (B는 항상 A의 배수)
         * WARBOY 가격 C = 3*B/A
         * WARBOY 성능 = 3*B/A*C
         */
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        str.append(3*B/A*C);

        System.out.print(str);
        br.close();
    }
}
