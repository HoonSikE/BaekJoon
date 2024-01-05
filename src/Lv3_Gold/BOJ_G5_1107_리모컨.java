package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category .
 * https://www.acmicpc.net/problem/.
 */
public class BOJ_G5_1107_리모컨 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = null;
//        StringBuilder str = new StringBuilder();
//
//        // N
//        int N = Integer.parseInt(br.readLine());
//
//        for (int n = 0; n < N; n++){
//            st = new StringTokenizer(br.readLine());
//            Integer.parseInt(st.nextToken());
//            Integer.parseInt(br.readLine());
//        }
//        System.out.print(str);
//        br.close();
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        int m = scan.nextInt();

        boolean[] broken = new boolean[10];
        for(int i = 0; i < m; i++) {
            int n = scan.nextInt();
            broken[n] = true;
        }

        int result = Math.abs(target - 100); //초기값 설정
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(broken[str.charAt(j) - '0']) { //고장난 버튼을 눌러야 하면
                    isBreak = true;
                    break; //더 이상 탐색하지 않고 빠져나온다.
                }
            }
            if(!isBreak) { //i를 누를때 고장난 버튼을 누르지 않는다면
                int min = Math.abs(target - i) + len; //i를 누른 후(len) target까지 이동하는 횟수(target - i)
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
