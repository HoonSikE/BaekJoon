package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/2145
 */
public class BOJ_B2_2145_숫자_놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            // N
            String N = br.readLine();

            if(N.equals("0"))
                break;

            String[] result = N.split("");
            while(true){
                int tmp = 0;
                for(int i = 0; i < result.length; i++){
                    tmp += Integer.parseInt(result[i]);
                }
                if(tmp < 10){
                    str.append(tmp).append("\n");
                    break;
                }else{
                    result = String.valueOf(tmp).split("");
                }
            }
        }

        System.out.print(str);
        br.close();
    }
}
