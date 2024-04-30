package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 두 포인터
 * https://www.acmicpc.net/problem/2018
 */
public class BOJ_S5_2018_수들의_합_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int result = 1;

        for (int n = 1; n < N/2+1; n++){
            int sum = n;
            for (int m = n+1; m <= N; n++){
                sum += m;
                if(sum == N){
                    result++;
                    break;
                }else if(sum > N){
                    break;
                }
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
