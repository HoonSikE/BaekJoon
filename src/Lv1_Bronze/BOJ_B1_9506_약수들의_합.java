package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category .
 * https://www.acmicpc.net/problem/.
 */
public class BOJ_B1_9506_약수들의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1)
                break;

            boolean flag = false;

            for(int i = 1; i < N; i++){
                if(N % i == 0)
                    str.append(i).append(" + ");
            }
            if(!flag)
                str.append(N).append(" is NOT perfect\n");
        }

        System.out.print(str);
        br.close();
    }
}
