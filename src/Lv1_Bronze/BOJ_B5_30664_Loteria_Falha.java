package Lv1_Bronze;

import java.io.*;
import java.math.BigInteger;
/**
 * @author HanHoon
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/30664
 */
public class BOJ_B5_30664_Loteria_Falha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S = br.readLine();

        while(true){
            if(S.equals("0") || S == null || S.equals(""))
                break;

            BigInteger n = new BigInteger(S);

            if(n.mod(new BigInteger("42"))
                .compareTo(new BigInteger("0")) == 0)
                str.append("PREMIADO\n");
            else
                str.append("TENTE NOVAMENTE\n");
            
            S = br.readLine();
        }

        System.out.print(str);
        br.close();
    }
}
