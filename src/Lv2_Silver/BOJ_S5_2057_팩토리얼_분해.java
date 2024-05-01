package Lv2_Silver;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 그리디 알고리즘, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2057
 */
public class BOJ_S5_2057_팩토리얼_분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        long N = Long.parseLong(br.readLine());
        long[] arr = new long[21];

        if(N == 0){
            System.out.println("NO");
            return;
        }

        // 팩토리얼 누적합 저장
        arr[0] = 1;
        for(int i = 1; i <= 20; i++)
            arr[i] = arr[i-1] * i;

        // 큰값부터 뺴간다.
        for(int i = 20; i >= 0; i--)
            if(N >= arr[i])
                N -= arr[i];

        // 0이라면 가능
        if(N == 0)
            str.append("YES");
        // 0이 아니라면 불가능
        else
            str.append("NO");


        System.out.print(str);
        br.close();
    }
}
