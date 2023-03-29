package Lv3_Gold;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 누적 합
 * https://www.acmicpc.net/problem/25682
 */
public class BOJ_G5_25682_체스판_다시_칠하기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // MxN 크기의 보드
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // KxK 크기의 체스판으로 만듦
        int K = Integer.parseInt(st.nextToken());

        // B: 검은색, W: 흰색
        

        // KxK 보드를 체스판으로 만들기 위해 다시 칠해야 하는 정사각형 개수의 최솟값
        System.out.print(str);
        br.close();
    }
}
