package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/10818
 */
public class BOJ_B5_10818_최소_최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N개의 정수
        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            max = max > tmp ? max : tmp;
            min = min < tmp ? min : tmp;
        }
        str.append(min).append(" ").append(max);
        System.out.print(str);
        br.close();
    }
}
