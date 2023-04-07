package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 누적 합
 * https://www.acmicpc.net/problem/16139
 */
public class BOJ_S1_16139_인간_컴퓨터_상호작용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // S: 특정 문자열
        String S = br.readLine();
        // q: 질문의 수
        int q = Integer.parseInt(br.readLine());

        // 누적합 기록 배열
        int[][] dp = new int[S.length()+1]['z'-'a'+1];
        // 누적 합 계산
        for(int i = 1; i <= S.length(); i++){
            int cnt = dp[i-1][S.charAt(i-1)-'a'] + 1;
            // 문자열 S의 길이는 200,000자 이하이므로 열마다 값을 초기화 하는 것 보다, 각 행마다 돌려주는 것이 유리하다.
            for (int n = 0; n < 'z'-'a'+1; n++)
                dp[i][n] = n == S.charAt(i-1)-'a' ? dp[i-1][n]+1 : dp[i-1][n];
        }

        for (int n = 0; n < q; n++){
            st = new StringTokenizer(br.readLine());
            char alpa = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            str.append(dp[r+1][alpa-'a'] - dp[l][alpa-'a']).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}