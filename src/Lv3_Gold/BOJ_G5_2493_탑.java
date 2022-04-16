package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 자료 구조, 스택
 * https://www.acmicpc.net/problem/2493
 */
public class BOJ_G5_2493_탑 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		// 제네릭 형태에 int[], 클래스 형태 다 가능하다.
		Stack<int[]> stack = new Stack<>();
		// 탑의 수 N
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 풀면서 한계점... -> 탑의 높이 비교하는 부분은 잘 했으나, 몇번째 탑인지 받아오는 부분이 미흡해서 소스를 따로 공부했습니다..
		for (int i = 1; i <= N; i++) {
			// 현재 탑 높이
			int tmp = Integer.parseInt(st.nextToken());
			// 수신할 탑이 있다면
			while(!stack.empty()) {
				// 이전 탑 높이 < 현재 탑 높이 라면 버린다(pop). ([0]에 탑의 위치가 있으므로 필요가 없음)
				if(stack.peek()[1] < tmp) {
					stack.pop();
				}else {
					// 이전 탑의 높이 > 현재 탑 높이 라면 탑의 위치값 출력
					result.append(stack.peek()[0] + " ");
					break;
				}
			}
			// 수신할 탑이 없다면
			if(stack.empty()) {
				result.append("0 ");
				stack.push(new int[] {i, tmp});
			}
			// [0] : (1~N)번째 탑, [1] : 탑의 높이
			stack.push(new int[] {i, tmp});
		}
		System.out.print(result.toString());
		br.close();
	}
}
