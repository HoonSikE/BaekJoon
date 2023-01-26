package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/1009
 */
public class BOJ_B2_분산처리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            // Math.pow를 사용하게 되면 Overflow 발생
            // str.append((int) Math.pow(A,B)%10).append("\n");
            // overflow를 방지하기 위해 필요한 1의 자리만 계산해준다.
            int tmp = 1;
            for(int i = 0; i < B; i++)
                tmp = (tmp * A)%10;
            // 0번 컴퓨터는 없으므로 10으로 바꿔준다.
            if(tmp==0) tmp = 10;
            str.append(tmp).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
