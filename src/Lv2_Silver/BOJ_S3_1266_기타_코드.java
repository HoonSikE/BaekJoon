package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1266
 */
public class BOJ_S3_1266_기타_코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 12개의 음햐
        String[] arr = new String[] { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };

        // N: 기타 줄의 개수, M: 코드를 구성하는 음의 개수
        int N = Integer.parseInt(st.nextToken());;
        int M = Integer.parseInt(st.nextToken());;

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++){
            Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int m = 0; m < M; m++){
            Integer.parseInt(st.nextToken());
        }
        System.out.print(str);
        br.close();
    }
}
