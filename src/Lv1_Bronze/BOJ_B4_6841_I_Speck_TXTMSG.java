package Lv1_Bronze;

import java.io.*;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/6841
 */
public class BOJ_B4_6841_I_Speck_TXTMSG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S = br.readLine();

        while(true){
            String result = "";

            switch (S) {
                case "CU":
                    result = "see you";
                    break;
                case ":-)":
                    result = "I’m happy";
                    break;
                case ":-(":
                    result = "I’m unhappy";
                    break;
                case ";-)":
                    result = "wink";
                    break;
                case ":-P":
                    result = "stick out my tongue";
                    break;
                case "(~.~)":
                    result = "sleepy";
                    break;
                case "TA":
                    result = "totally awesome";
                    break;
                case "CCC":
                    result = "Canadian Computing Competition";
                    break;
                case "CUZ":
                    result = "because";
                    break;
                case "TY":
                    result = "thank-you";
                    break;
                case "YW":
                    result = "you’re welcome";
                    break;
                case "TTYL":
                    result = "talk to you later";
                    break;
                default:
                    result = S;
                    break;
            }

            str.append(result).append("\n");

            if(S.equals("TTYL"))
            break;

            S = br.readLine();
        }

        System.out.print(str);
        br.close();
    }
}
