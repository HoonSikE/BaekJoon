package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 덱
 * https://www.acmicpc.net/problem/1021
 */
public class BOJ_S3_1021_회전하는_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // N: 큐의 크기
        int N = Integer.parseInt(st.nextToken());
        // M: 뽑아내려고 하는 수의 개수
        int M = Integer.parseInt(st.nextToken());
        // 연산 횟수
        int cnt = 0;

        // 큐 초기화
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            deque.offer(i);

        // 뽑아내려는 수
        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int m = 0; m < M; m++)
            arr[m] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++){
            // 뽑고자 하는 숫자의 위치
            int targetIdx = deque.indexOf(arr[i]);
            // 중간 지점 판별 (짝수일 경우 중간 좌측 지점)
            int halfIdx = (int) ((deque.size()-0.5) / 2);
//            int halfIdx;
//            if(deque.size()%2 == 0)
//                halfIdx = deque.size() / 2 - 1;
//            else
//                halfIdx = deque.size() / 2;

            // 좌측에 타겟이 있을 경우
            if(targetIdx <= halfIdx){
                for(int j = 0; j < targetIdx; j++){
                    // 앞 원소를 뒤로 보내준다.
                    deque.offerLast(deque.pollFirst());
                    cnt++;
                }
            }
            // 우측에 타겟이 있을 경우
            else{
                for(int j = 0; j < deque.size() - targetIdx; j++){
                    // 뒤 원소를 앞으로 보내준다.
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                }
            }
            // 연산 후 타켓 원소 제거
            deque.pollFirst();
        }

        str.append(cnt);

        System.out.print(str);
        br.close();
    }
}
