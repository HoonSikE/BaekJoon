package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/20491
 */
public class BOJ_B5_20492_세금 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();


        String S = br.readLine();
        int index = 1;

        while(true){
            if(S.equals("0"))
                break;
            else
                str.append("Case " + index + ": Sorting... done!\n");

            S = br.readLine();
            index++;
        }

        System.out.print(str);
        br.close();
    }
}
