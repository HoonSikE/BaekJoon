import java.io.*;
/**
 * @author HanHoon
 * @category 구현, 그리디 알고리즘, 문자열, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/1515
 */
public class BOJ_S3_1515_수_이어_쓰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        // 문자열 포인터 위치
        int pt = 0;
        // 현재 탐색할 숫자
        int base = 0;
        // 최대 3000자리이므로 최악의 케이스는 3000*10으로 설정
        // 왜냐하면, 1~2자리 숫자로도 충분하기 때문
        while (base++ <= 30000) {
            String tmp = String.valueOf(base);
            for (int i = 0; i < tmp.length(); i++) {
                // 탐색하는 숫자가 1개라도 맞으면 문자열 포인터 이동
                // 2자리 전부 맞다면 포인터가 같이 이동해서 최솟값 측정이 된다. (3자리 생각X)
                if (tmp.charAt(i) == N.charAt(pt))
                    pt++;
                // 마지막 까지 탐색핬다면 그 수가 N의 최솟값이다.
                if (pt == N.length()) {
                    System.out.print(base);
                    return;
                }
            }
        }
        br.close();
    }
}
