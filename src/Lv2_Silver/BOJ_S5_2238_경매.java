package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2238
 */
public class BOJ_S5_2238_경매 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;

        int U = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] arr = new String[U+1];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            int P = Integer.parseInt(st.nextToken());

            if(arr[P] == null){
                arr[P] = S;
            }else{
                arr[P] = arr[P] + "dup";
            }
        }

        for (int n = 0; n <= U; n++){
            if(arr[n] != null && !arr[n].contains("dup")){
                System.out.print(arr[n] + " " + n);
                return;
            }
        }

        for (int n = 0; n <= U; n++){
            if(arr[n] != null && arr[n].contains("dup")){
                System.out.print(arr[n].replace("dup", "") + " " + n);
                return;
            }
        }

        br.close();
    }
}
