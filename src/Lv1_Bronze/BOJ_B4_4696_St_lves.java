package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/4696
 */
public class BOJ_B4_4696_St_lves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            double n = Double.parseDouble(br.readLine());
            if(n == 0)
                break;

            // 남자, 아내의 수, 아내당 자루 수, 자루당 고양이 수, 그해 로버트가 만난 고양이 수
            System.out.printf("%.2f\n", 1 + n + n*n + n*n*n + n*n*n*n);
        }

        br.close();
    }
}
