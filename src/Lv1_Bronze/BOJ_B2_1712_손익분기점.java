package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/1712
 */
public class BOJ_B2_1712_손익분기점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // A: 매년 고정 비용 (임대료, 재산세, 보험료, 급여)
        int A = Integer.parseInt(st.nextToken());
        // B: 한 대당 가변 비용 (재료비, 인건비)
        int B = Integer.parseInt(st.nextToken());
        // C: 노트북 가격
        int C = Integer.parseInt(st.nextToken());

        /**
         * 손익분기점(Break-Even Point) : 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점
         */
        if(C <= B)
            str.append(-1);
        else
            str.append(A/(C-B)+1);

        System.out.print(str);
        br.close();
    }
}
