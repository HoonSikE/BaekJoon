package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열, 시뮬레이션, 파싱
 * https://www.acmicpc.net/problem/1942
 */
public class BOJ_B2_1942_디지털시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = 3;

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine(), " ");
            String s1 = st.nextToken().replace(":", "");
            String s2 = st.nextToken().replace(":", "");

            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);

            int count = 0;

            int current = n1;
            while(current != n2){
                // 3의 배수면 카운팅
                if(current%3 == 0) {
                    count++;
                }

                // 다음 수
                int tmp = current+1;
                int next = 0;

                // 초 단위 계산
                if(tmp%100 >= 60){
                    next += tmp%100 - 60;
                    tmp = tmp/100 + 1;
                }else{
                    next += tmp%100;
                    tmp = tmp/100;
                }

                // 분 단위 계산
                if(tmp%100 >= 60){
                    next += (tmp%100 - 60) * 100;
                    tmp = tmp/100 + 1;
                }else{
                    next += (tmp%100) * 100;
                    tmp = tmp/100;
                }

                // 시 단위 계산
                if(tmp%100 >= 24){
                    next += (tmp%100 - 24) * 10000;
                }else{
                    next += (tmp%100) * 10000;
                }
                current = next;
            }
            // 마지막 값 체크
            if(n2%3 == 0)
                count++;

            str.append(count).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
