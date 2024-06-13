package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/6764
 */
public class BOJ_B4_6764_Sounds_fishy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int N = 4;
        int[] arr = new int[N];

        for(int n = 0; n < 4; n++){
            arr[n] = Integer.parseInt(br.readLine());
        }

        if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3])
            str.append("Fish Rising");
            //(4)
        else if(arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3])
            str.append("Fish Diving");
            //(5)
        else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3])
            str.append("Fish At Constant Depth");
            //(6)
        else
            str.append("No Fish");

        System.out.print(str);
        br.close();
    }
}
