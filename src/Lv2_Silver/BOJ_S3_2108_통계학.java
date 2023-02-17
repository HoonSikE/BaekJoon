package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 정렬
 * https://www.acmicpc.net/problem/2108
 */
public class BOJ_S3_2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N개의 정수 (홀수, 절대값 4000 이하)
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        // 범위 : -4000 ~ 4000
        int[] mode = new int[8001];

        for (int n = 0; n < N; n++){
            arr[n] = Integer.parseInt(br.readLine());
            sum += arr[n];
            mode[arr[n] + 4000]++;
        }
        Arrays.sort(arr);

        /** 첫째 줄: 산술평균 (소수점 첫쨰 자리에서 반올림) */
        int avg = (int) Math.round((double) sum / N);
        str.append(avg).append("\n");

        /** 둘째 줄: 중앙값 */
        int tmp = (int) (N/2.0);
        str.append(arr[tmp]).append("\n");

        /** 셋째 줄: 최빈값 (카운팅 정렬 응용) */
        int modeNum = 0;
        int modeCnt = 0;
        Boolean modeFlag = false;
        // 값이 존재하는 범위에서만 for문을 돌려주자. (4000이 중앙값)
        for(int i = arr[0]+4000; i <= arr[N-1]+4000; i++){
            // 최빈값 갱신
            if(modeCnt < mode[i]){
                modeCnt = mode[i];
                modeNum = i - 4000;
                modeFlag = true;
            // 카운트가 같다면 2번쨰로 작은 값을 출력
            }else if(modeCnt == mode[i] && modeFlag){
                modeNum = i - 4000;
                modeFlag = false;
            }
        }
        str.append(modeNum).append("\n");

        /** 넷째 줄: 범위 */
        str.append(Math.abs(arr[N-1] - arr[0])).append("\n");

        System.out.print(str);
        br.close();
    }
}
