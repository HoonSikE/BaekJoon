package Lv3_Gold;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 자료 구조, 문자열, 파싱, 덱
 * https://www.acmicpc.net/problem/5430
 */
public class BOJ_G5_5430_AC {
    static StringBuilder str;
    static LinkedList<Integer> deque;
    static boolean isLeft;

    // 배열이 비어있는데 D를 사용한 경우에는 에러 발생
    public static boolean isCanD(String p, int n){
        int dCnt = p.length() - p.replace("D", "").length();
        if(dCnt > n) {
            // 수행 결과 출력
            str.append("error\n");
            return false;
        }
        return true;
    }
    // 연산
    public static void operator(String p){
        for(int i = 0; i < p.length(); i++){
            // 2번 연속 뒤집을 필요는 없다.
            if(p.charAt(i) == 'R')
                if(i < p.length()-1 && p.charAt(i+1) == 'R')
                    i++;
                else
                    isLeft = !isLeft;
            // 첫 번째 수 반환
            else if(p.charAt(i) == 'D')
                if(isLeft)
                    deque.pollFirst();
                else
                    deque.pollLast();
        }
    }
    // 수행 결과 출력
    public static void printResult(){
        str.append("[");

        if(!deque.isEmpty()) {
            while (true) {
                if (isLeft)
                    str.append(deque.pollFirst());
                else
                    str.append(deque.pollLast());

                if (!deque.isEmpty())
                    str.append(",");
                else
                    break;
            }
        }
        str.append("]\n");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        str = new StringBuilder();

        // T: 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            // 수행할 함수 p
            String p = br.readLine();
            // 배열에 들어있는 수의 개수 n
            int n = Integer.parseInt(br.readLine());

            // 숫자 배열
            deque = new LinkedList<>();
            // 덱의 방향
            isLeft = true;
            st = new StringTokenizer(br.readLine(), "[],");
            while(st.hasMoreTokens()){
                deque.add(Integer.parseInt(st.nextToken()));
            }

            // 배열이 비어있는데 D를 사용한 경우에는 에러 발생
            if(!isCanD(p, n))
                continue;;

            // 연산
            operator(p);

            // 수행 결과 출력
            printResult();
        }
        System.out.print(str);
        br.close();
    }
}
