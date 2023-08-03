package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1333
 */
public class BOJ_B2_1333_부재중_전화 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        ArrayList<Boolean> list = new ArrayList<>();

        for(int n = 0; n < N; n++){
            // 노래 출력
            for(int l = 0; l < L; l++)
                list.add(true);

            // 마지막 곡이 아니면 음악 사이 5초동안 조용함
            if(n != N-1)
                for(int t = 0; t < 5; t++)
                    list.add(false);
        }

        int result = 0;

        // 노래를 들을 수 있는 구간 찾기
        while(result < list.size()){
            if(list.get(result) == false)
                break;
            result += D;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
