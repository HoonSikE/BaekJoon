package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2097
 */
public class BOJ_S5_2097_조약돌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        long N = Long.parseLong(br.readLine());

        if(N < 3){
            System.out.println(4);
            return;
        }

        for (long n = 2; n < N; n++){
            // 정사각형 안에 다 들어가는 경우
            if(n*n >= N){
                str.append((n-1)*4);
                break;
            }
            // 가로나 세로가 1 더 넓을 때 들어가는 경우
            else if(n*(n+1) >= N){
                str.append((n-1)*4+2);
                break;
            }
        }

        System.out.print(str);
        br.close();
    }
}
