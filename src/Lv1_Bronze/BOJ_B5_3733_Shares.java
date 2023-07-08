package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/3733
 */
public class BOJ_B5_3733_Shares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            String line = br.readLine();
            if(line == null || line.equals(""))
                break;

            st = new StringTokenizer(line);

            int N = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            str.append(S/(N+1)).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}
