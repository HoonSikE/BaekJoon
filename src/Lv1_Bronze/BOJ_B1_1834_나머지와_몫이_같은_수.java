package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학
 * https://www.acmicpc.net/problem/1834
 */
public class BOJ_B1_1834_나머지와_몫이_같은_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N: int로 하면 형변환 오류 발생
        long N = Long.parseLong(br.readLine());

        // 몫과 나머지가 같은 수
        long result = 0;

        for(int n = 0; n < N; n++){
            result += (N+1)*n;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
