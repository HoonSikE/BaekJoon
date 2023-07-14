package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/4589
 */
public class BOJ_B4_4589_Gnome_Sequencing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        str.append("Gnomes:\n");

        for (int n = 0; n < N; n++){
            boolean ascCheck = true;
            boolean descCheck = true;
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            for(int i = 1; i < 3; i++){
                int tmp = Integer.parseInt(st.nextToken());

                if(num < tmp)
                    descCheck = false;
                else if(num > tmp)
                    ascCheck = false;

                num = tmp;
            }

            if(ascCheck || descCheck)
                str.append("Ordered\n");
            else
                str.append("Unordered\n");
        }
        System.out.print(str);
        br.close();
    }
}
