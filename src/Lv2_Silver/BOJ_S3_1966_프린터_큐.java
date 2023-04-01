package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 구현, 자료 구조, 시뮬레이션, 큐
 * https://www.acmicpc.net/problem/1966
 *
 * stack 명령어
 * push(), peek(), pop(), empty()
 *
 * queue 명령어
 * add(), offer(), peek(), poll()
 */
public class BOJ_S3_1966_프린터_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // T: 테스트 케이스 수
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            st = new StringTokenizer(br.readLine());
            // N: 문서의 개수
            int N = Integer.parseInt(st.nextToken());
            // M: 몇 번째에 놓여있는지 나타내는 정수
            int M = Integer.parseInt(st.nextToken());

            // 프린트기
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            // {초기 위치, 중요도}
            for(int n = 0; n < N; n++)
                queue.offer(new int[] {n, Integer.parseInt(st.nextToken())});

            // 출력 횟수
            int cnt = 0;

            // 우선 순위 재정렬
            while(!queue.isEmpty()){
                // 가장 앞 원소
                int[] front = queue.poll();
                // 가장 큰 원소인지? 가장 큰 원소면 출력하자.
                boolean isMax = true;

                // 중요도 비교
                for(int i = 0; i < queue.size(); i++){
                    // 가장 앞에 있는 원소보다 i 번째있는 원소의 중요도가 더 높다면
                    if(front[1] < queue.get(i)[1]){
                        // 이전의 모든 원소는 뒤로 간다.
                        queue.offer(front);
                        for(int j = 0; j < i; j++)
                            queue.offer(queue.poll());
                        // 가장 큰 원소가 아니다.
                        isMax = false;
                        break;
                    }
                }

                // 가장 큰 원소가 아니라면 다시 검토
                if(!isMax)
                    continue;

                // 가장 큰 원소를 출력했다면 출력횟수 증가
                cnt++;

                // 출력한 원소가 M번째라면 정답
                if(front[0] == M)
                    break;
            }
            str.append(cnt).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
