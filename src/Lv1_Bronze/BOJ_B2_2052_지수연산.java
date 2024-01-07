package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author HanHoon
 * @category 수학, 임의 정밀도 / 큰 수 연산
 * https://www.acmicpc.net/problem/2052
 */
public class BOJ_B2_2052_지수연산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        BigDecimal result = BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(N));

        // stripTrailingZeros: 불필요한 0 제거
        // toPlainString: 소수 형태 출력
        str.append(result.stripTrailingZeros().toPlainString());

        System.out.print(str);
        br.close();
    }
}
