package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/30224
 */
public class BOJ_B5_30224_Lucky_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String N = br.readLine();

        // 숫자에 7이 포함되지 있지 않고 7로 나누어 지지 않으면 0
        // 숫자에 7이 포함되어 있지 않지만 7로 나눌 수 있으면 1
        if(!N.contains("7")){
            if(Integer.parseInt(N)%7 != 0){
                str.append(0);
            }else{
                str.append(1);
            }
        }
        // 숫자에 7이 포함되어 있고 7로 나누어지지 않으면 2
        // 숫자에 7이 포함되어 있고 7로 나눌 수 있으면 3
        else{
            if(Integer.parseInt(N)%7 != 0){
                str.append(2);
            }else{
                str.append(3);
            }
        }

        System.out.print(str);
        br.close();
    }
}
