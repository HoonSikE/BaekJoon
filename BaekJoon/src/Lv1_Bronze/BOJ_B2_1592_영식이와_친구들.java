package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1592
 */
public class BOJ_B2_1592_영식이와_친구들 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 시계방향으로 1~N까지 적혀있는 자리에 앉는다
		int N = Integer.parseInt(st.nextToken());
		// 한사람이 공을 M번 받으면 게임은 끝난다. (1번부터 시작)
		int M = Integer.parseInt(st.nextToken());
		// 공을 받은 횟수가 홀수번이면 시계 반대로 L번째, 짝수번이면 자기의 현재 위치에서 반시계 방향으로 L번째 있는 사람에게 던진다.
		int L = Integer.parseInt(st.nextToken());

		int[] people = new int[N];
		// 처음은 첫번째 사람이 던짐
		int index = 0;
		int result = 0;
		while(true) {
			// index의 사람 던진횟수 + 1
			people[index]++;
			if(people[index] == M) break;
			
			// 받은 횟수가 홀수일 때
			if(people[index]%2 == 1) {
				// 반시계 방향 L번쨰 사람
				if(index-L >= 0)
					index -= L;
				else
					index = N + (index-L);
			// 받은 횟수가 짝수일 때
			} else {
				// 시계 방향 L번쨰 사람
				if(index+L < N)
					index += L;
				else
					index = (index+L) - N;
			}
			// 전체 던진 횟수 +1
			result++;
		}
		System.out.println(result);
		br.close();
	}
}
