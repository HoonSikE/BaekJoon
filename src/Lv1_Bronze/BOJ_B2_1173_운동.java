package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1173
 */
public class BOJ_B2_1173_운동 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 운동을 N분
        int N = Integer.parseInt(st.nextToken());
        // 초기 맥박
        int m = Integer.parseInt(st.nextToken());
        // 맥박은 M이 넘지 않도록 한다
        int M = Integer.parseInt(st.nextToken());
        // 1분 운동하면 T만큼 증가
        int T = Integer.parseInt(st.nextToken());
        // 휴식하는 경우 R만큼 감소
        int R = Integer.parseInt(st.nextToken());

        int move = 0;
        int time = 0;
        int initM = m;
        while(move != N){
            time++;
            if(m+T <= M){
                // 운동하면 맥박 증가
                move++;
                m += T;
            }else{
                // 맥박 초과면 휴식
                m -= R;
                // 초기 맥박 이하로 떨어지면 초기값으로
                if(m < initM)
                    m = initM;
            }

            if(m+T > M && m == initM){
                break;
            }
        }

        if(move != N)
            str.append(-1);
        else
            str.append(time);

        System.out.print(str);
        br.close();
    }
}
