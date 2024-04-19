package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 그리디 알고리즘, 문자열
 * https://www.acmicpc.net/problem/1811
 */
public class BOJ_S5_1811_Adjacent_Mastermind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        String S = br.readLine();

        while(!S.equals("#")){
            st = new StringTokenizer(S);

            String A = st.nextToken();
            String B = st.nextToken();

            int black = 0;
            int grey = 0;
            int white = 0;

            // 체크한 부분인지 저장
            boolean[] isVisitBlack = new boolean[A.length()];
            boolean[] isVisitGrey = new boolean[A.length()];

            // black 먼저 검사
            for(int i = 0; i < A.length(); i++){
                // 같으면 black, 체크
                if(A.charAt(i) == B.charAt(i)) {
                    black++;
                    isVisitBlack[i] = true;
                    isVisitGrey[i] = true;
                }
            }
            // grey 체크 검사
            for(int i = 0; i < A.length(); i++){
                // black이 아닌 경우 비교
                if(!isVisitBlack[i]){
                    // 바로 앞을 방문하지 않았다면
                    if(0 < i && !isVisitGrey[i-1]){
                        // grey, 체크
                        if(A.charAt(i-1) == B.charAt(i)) {
                            grey++;
                            isVisitGrey[i-1] = true;
                        }
                    }
                    // 바로 뒤를 방문하지 않았다면
                    if(i < A.length()-1 && !isVisitGrey[i+1]){
                        // grey, 체크
                        if(A.charAt(i+1) == B.charAt(i)) {
                            grey++;
                            isVisitGrey[i+1] = true;
                        }
                    }
                }
            }
            // white 검사
            String tmpA = "";
            String tmpB = "";
            for(int i = 0; i < A.length(); i++){
                // 체크하지 않은 부분 확인
                if(!isVisitGrey[i]) {
                    tmpA += A.charAt(i) + "";
                    tmpB += B.charAt(i) + "";
                }
            }

            for(int i = 0; i < tmpA.length(); i++){
//                tmpB = tmpB.replaceFirst(tmpA.charAt(i)+"", "");
                if(tmpB.contains(tmpA.charAt(i)+""))
                    white++;
            }
//            white = tmpA.length() - tmpB.length();
//            white = tmpA.length() - tmpB.length();

            str.append(B + ": ")
                .append(black + " black, ")
                .append(grey + " grey, ")
                .append(white + " white\n");

            S = br.readLine();
        }

        System.out.print(str);
        br.close();
    }
}
