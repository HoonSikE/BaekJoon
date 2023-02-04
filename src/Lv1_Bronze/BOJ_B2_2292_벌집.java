package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/2292
 */
public class BOJ_B2_2292_벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        /**
         * 테두리가 1개 지나갈 때 마다 6씩 더 증가한다.
         * 1 -> 7(+6) -> 19(+12) -> 37(+18) -> 61(+24)
         */
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 2;

        while(range <= N){
            if(N==1) break;
            range += 6*cnt;
            cnt++;
        }

        str.append(cnt);

        System.out.print(str);
        br.close();
    }
}
