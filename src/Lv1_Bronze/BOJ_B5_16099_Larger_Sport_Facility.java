package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/16099
 */
public class BOJ_B5_16099_Larger_Sport_Facility {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());
            long wt = Long.parseLong(st.nextToken());
            long le = Long.parseLong(st.nextToken());
            long we = Long.parseLong(st.nextToken());

            long areaT = lt*wt;
            long areaE = le*we;

            str.append(areaT==areaE ? "Tie" : areaT>areaE ? "TelecomParisTech" : "Eurecom").append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
