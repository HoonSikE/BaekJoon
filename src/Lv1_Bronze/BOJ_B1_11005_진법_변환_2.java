package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/11005
 */
public class BOJ_B1_11005_진법_변환_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N
        long N = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        ArrayList<Character> list = new ArrayList<>();

        while(N > 0){
            long tmp = N % B;
            N /= B;

            if(tmp < 10)
                list.add((char)(tmp + '0'));
            else
                list.add((char)(tmp - 10 + 'A'));
        }

        for(int i = list.size()-1; i >= 0; i--)
            str.append(list.get(i));

        System.out.print(str);
        br.close();
    }
}
