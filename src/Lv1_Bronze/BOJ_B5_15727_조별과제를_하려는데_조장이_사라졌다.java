package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/15727
 */
public class BOJ_B5_15727_조별과제를_하려는데_조장이_사라졌다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // L: 민건이 집까지의 거리
        int L = Integer.parseInt(br.readLine());

        str.append((int)Math.ceil(L/5.0));

        System.out.print(str);
        br.close();
    }
}
