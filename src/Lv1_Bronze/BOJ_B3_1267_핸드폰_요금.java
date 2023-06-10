package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/1267
 */
public class BOJ_B3_1267_핸드폰_요금 {
    public static int getMoney(int num, int time, int pay){
        if(num == 0)
            return 0;

        int output = 0;

        output += (num/time)*pay;
        num %= time;

        output = num >= 0 ? output+pay : output;

        return output;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        int Y = 0;
        int M = 0;

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            int num = Integer.parseInt(st.nextToken());
            Y += getMoney(num, 30, 10);
            M += getMoney(num, 60, 15);
        }

        if(Y == M)
            str.append("Y M ").append(Y);
        else if(Y > M)
            str.append("M ").append(M);
        else if(Y < M)
            str.append("Y ").append(Y);

        System.out.print(str);
        br.close();
    }
}
