package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 기하학, 피타고라스 정리
 * https://www.acmicpc.net/problem/4153
 */
public class BOJ_B3_4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for(int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;

            Arrays.sort(arr);

            if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2])
                str.append("right\n");
            else
                str.append("wrong\n");
        }

        System.out.print(str);
        br.close();
    }
}
