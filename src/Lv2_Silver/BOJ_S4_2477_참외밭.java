package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 기하학, 애드 훅
 * https://www.acmicpc.net/problem/2477
 */
public class BOJ_S4_2477_참외밭 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		// 1m^2 넓이에 자라는 참외의 개수(1~20)
		int num = Integer.parseInt(br.readLine());
		// 총 면적
		int max = 0;
		int sum = 0;
		// 처음 값 1번 받아줌, 방향값은 버리고, 거리값만 사용
		st = new StringTokenizer(br.readLine(), " ");
		st.nextToken();
		int first = Integer.parseInt(st.nextToken());
		int pre = first;
		// 값 받아줌과 동시에 max, sum 계산
		for (int n = 1; n < 6; n++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			int length = Integer.parseInt(st.nextToken());
			// 가장 큰 사각형 max값 갱신
			max = Math.max(length*pre, max);
			// 사각형 크기 누적
			sum += length*pre;
			pre = length;
		}
		// 마지막 변 * 첫번째 변 계산
		max = Math.max(first*pre, max);
		sum += first*pre;
		// 단위 면적당 참외 갯수 x 총 면적
		System.out.println(num*(sum-max*2));
		br.close();
	}
}
