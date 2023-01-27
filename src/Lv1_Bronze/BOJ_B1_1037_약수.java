package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 정수론
 * https://www.acmicpc.net/problem/1037
 */
public class BOJ_B1_1037_약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 정수의 개수 N
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        // 찾으려고 하는 정수
        int v = Integer.parseInt(br.readLine());
        // 결과값
        int result = 0;

        for (int i = 0; i < N; i++)
            if(Integer.parseInt(st.nextToken()) == v)
                result++;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
