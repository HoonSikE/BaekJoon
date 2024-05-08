package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/28938
 */
public class BOJ_B5_28938_KOHBeNep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        /**
         * -1: 왼쪽 1인치
         * 1: 오른쪽 1인치
         * 0: 왼쪽 1인치
         */
        int position = 0;
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            int x = Integer.parseInt(st.nextToken());
            if(x == 1)
                position++;
            else if(x == -1)
                position--;
        }

        if(position > 0)
            str.append("Right");
        else if(position == 0)
            str.append("Stay");
        else if(position < 0)
            str.append("Left");

        System.out.print(str);
        br.close();
    }
}