package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 사칙연산
 * https://www.acmicpc.net/problem/3003
 */
 public class BOJ_B5_킹_퀸_룩_비숍_나이트_폰 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         StringBuilder str = new StringBuilder();

         // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
         int[] chess = {1, 1, 2, 2, 2, 8};

         for (int i = 0; i < 6; i++)
             str.append(chess[i]-Integer.parseInt(st.nextToken())).append(" ");

         br.close();
         System.out.print(str);
     }
 }
