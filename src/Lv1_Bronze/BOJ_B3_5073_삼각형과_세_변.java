package Lv1_Bronze;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 구현, 기하학
 * https://www.acmicpc.net/problem/5073
 */
public class BOJ_B3_5073_삼각형과_세_변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];

            for(int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            if(arr[0]==0 && arr[1]==0 && arr[2]==0)
                break;

            if(arr[0]+arr[1] <= arr[2])
                str.append("Invalid\n");
            else if(arr[0]==arr[1] && arr[1]==arr[2])
                str.append("Equilateral\n");
            else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0])
                str.append("Isosceles\n");
            else
                str.append("Scalene\n");
        }

        System.out.print(str);
        br.close();
    }
}
