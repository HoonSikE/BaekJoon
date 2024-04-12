package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/27219
 */
public class BOJ_B5_27219_Po6NH3OH_Kpy30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        String result = "";

        // 매일 I, 5일에 1번씩 4개 지우고 V
        for (int n = 1; n <= N; n++){
            if(n%5 == 0){
                result = result.substring(0, result.length()-4) + "V";
            }else{
                result += "I";
            }
        }
        str.append(result);

        System.out.print(str);
        br.close();
    }
}
