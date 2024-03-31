package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/25372
 */
public class BOJ_B5_25372_성택이의_은밀한_비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++){
            int length = br.readLine().length();
            if(6 <= length && length <= 9){
                str.append("yes\n");
            }else{
                str.append("no\n");
            }
        }

        System.out.print(str);
        br.close();
    }
}
