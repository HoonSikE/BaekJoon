package Lv1_Bronze;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 정렬
 * https://www.acmicpc.net/problem/2750
 *
 * String으로 했을 떄 결과는 똑같지만 검산과정에서 플렸다고 뜬다.
 * 그래서 귀찮더라도 Integer.parseInt로 바꿔줘야 한다.
 */
public class BOJ_B2_2750_수_정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // 테스트 케이스 개수 N
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++)
            list.add(Integer.parseInt(br.readLine()));

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++)
            str.append(list.get(i)).append("\n");

        System.out.print(str);
        br.close();
    }
}
