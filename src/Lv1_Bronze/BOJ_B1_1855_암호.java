package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1855
 */
public class BOJ_B1_1855_암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 열의 개수
        int K = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int N = S.length() / K;

        // 열
        for (int k = 0; k < K; k++){
            // 행
            for (int n = 0; n < N; n++){
                // 몇번 째 줄인지
                int idx = n*K;
                // 짝수행은 좌부터 홀수행은 우부터
                // 짝수 행
                if(n%2 == 0){
                    idx += k;
                }
                // 홀수 행
                else{
                    idx += (K-1-k);
                }
                str.append(S.charAt(idx));
            }
        }
        System.out.print(str);
        br.close();
    }
}
