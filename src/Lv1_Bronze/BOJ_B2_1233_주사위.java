package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1233
 */
public class BOJ_B2_1233_주사위 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int[] arr = new int[S1+S2+S3+1];
        int result = 0;
        for(int s1 = 1; s1 <= S1; s1++){
            for(int s2 = 1; s2 <= S2; s2++) {
                for (int s3 = 1; s3 <= S3; s3++) {
                    arr[s1+s2+s3]++;
                    if(arr[result] < arr[s1+s2+s3])
                        result = s1+s2+s3;
                    else if(arr[result] == arr[s1+s2+s3])
                        result = Math.min(result, s1+s2+s3);
                }
            }
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
