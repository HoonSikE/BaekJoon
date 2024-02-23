package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/14581
 */
public class BOJ_B5_14581_팬들에게_둘러싸인_홍준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String id = br.readLine();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                str.append(":");
                if(i==1 && j==1){
                    str.append(id);
                }else{
                    str.append("fan");
                }
                str.append(":");
            }
            str.append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
