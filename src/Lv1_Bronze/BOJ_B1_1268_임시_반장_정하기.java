package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/1268
 */
public class BOJ_B1_1268_임시_반장_정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int M = 5;
        int[][] arr = new int[N][M];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            for(int m = 0; m < M; m++)
                arr[n][m] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int num = 0;
        // 반장 후보 선별
        for(int t = 0; t < N; t++){
            HashSet<Integer> set = new HashSet<>();
            // 학년별
            for(int m = 0; m < M; m++){
                for(int n =0; n < N; n++){
                    // 자기 자신 제외
                    if(n == t)
                        continue;
                    // 같은 반인 친구가 있으면 아는 친구
                    if(arr[t][m] == arr[n][m])
                        set.add(n);
                }
            }
            if(num < set.size()){
                result = t;
                num = set.size();
            }
        }

        str.append(result+1);

        System.out.print(str);
        br.close();
    }
}
