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

        int[][] dp = new int[S.length()+1]['z'-'a'+1];
        for(int i = 1; i <= S.length(); i++){
            int cnt = dp[i-1][S.charAt(i-1)-'a'+1] + 1;
            for (int n = i; n <= S.length(); n++) {
                dp[n][S.charAt(i-1)-'a'+1] = cnt;
            }
        }

        for (int i = 0; i < S.length()+1; i++) {
            for (int j = 0; j < 'z'-'a'+1; j++) {
                str.append(dp[i][j] + " ");
            }
            str.append("\n");
        }

        for (int n = 0; n < q; n++){
            st = new StringTokenizer(br.readLine());
            char alpa = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            str.append(dp[r][alpa-'a'+1] - dp[l][alpa-'a'+1]).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
