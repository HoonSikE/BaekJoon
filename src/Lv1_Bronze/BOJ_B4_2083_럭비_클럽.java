package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/2083
 */
public class BOJ_B4_2083_럭비_클럽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if(name.equals("#") && age == 0 && weight == 0)
                break;

            str.append(name);

            if(age > 17 || weight >= 80)
                str.append(" Senior\n");
            else
                str.append(" Junior\n");
        }

        System.out.print(str);
        br.close();
    }
}
