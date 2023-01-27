package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/1547
 */
public class BOJ_B1_1547_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 과목 개수 N
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.print(str);
        br.close();
    }
}
