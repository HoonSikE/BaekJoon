package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현, 문자열
 * https://www.acmicpc.net/problem/25206
 */
public class BOJ_S5_25206_너의_평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // 학점 총합
        double sum = 0;
        // 과목 수
        double cnt = 0;

        for (int n = 0; n < 20; n++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            // 학점
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            switch(grade.charAt(0)){
                case 'P':
                    break;
                case 'F':
                    cnt++;
                    break;
                case 'A':
                    if(grade.charAt(1) == '+')
                        sum += 4.5 * credit;
                    else
                        sum += 4.0 * credit;
                    cnt += credit;
                    break;
                case 'B':
                    if(grade.charAt(1) == '+')
                        sum += 3.5 * credit;
                    else
                        sum += 3.0 * credit;
                    cnt += credit;
                    break;
                case 'C':
                    if(grade.charAt(1) == '+')
                        sum += 2.5 * credit;
                    else
                        sum += 2.0 * credit;
                    cnt += credit;
                    break;
                case 'D':
                    if(grade.charAt(1) == '+')
                        sum += 1.5 * credit;
                    else
                        sum += 1.0 * credit;
                    cnt += credit;
                    break;
            }
        }

        System.out.printf("%.6f\n", sum/cnt);

        br.close();
    }
}
