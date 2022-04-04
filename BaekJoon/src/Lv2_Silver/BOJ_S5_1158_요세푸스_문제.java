package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S5_1158_요세푸스_문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Queue<Integer> queue = new LinkedList<>();
		
		// 사람 수
		int N = Integer.parseInt(st.nextToken());
		// 1~N까지 입력
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		// K번째 사람 제거
		int K = Integer.parseInt(st.nextToken());
		str.append("<");
		while(!queue.isEmpty()) {
			if(queue.size() == 1)
				str.append(queue.poll());
			else {
				// K-1번째까지는 다시 넣어줌으로써 원형구조 생성
				for (int i = 0; i < K-1; i++) {
					queue.offer(queue.poll());
				}
				// K번쨰 값 제거 및 출력
				str.append(queue.poll()).append(", ");
			}
		}
		str.append(">");
			
		System.out.println(str.toString());
		br.close();
		br.close();
	}
}
