package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 다이나믹 프로그래밍
 * https://www.acmicpc.net/problem/2491
 */
public class BOJ_S3_2491_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = null;

		int max = 1, upcnt = 1, downcnt = 1;
		// N개의 숫자
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");

		// 1번째 값을 받아줌
		arr[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			// 숫자가 같으면 upcnt, downcnt 둘다 카운트+1
			if (arr[i - 1] == arr[i]) {
				upcnt++;
				downcnt++;
			}
			// 숫자가 커진다면 upcnt+1, downcnt 초기화
			else if (arr[i - 1] < arr[i]) {
				upcnt++;
				downcnt = 1;
			}
			//숫자가 작아진다면 upcnt 초기화, downcnt+1
			else if (arr[i - 1] > arr[i]) {
				upcnt = 1;
				downcnt++;
			}
			// upcnt, downcnt 최곳값 갱신
			if(max < upcnt)	max = upcnt;
			else if(max < downcnt) max = downcnt;
		}
		
		str.append(max);
		System.out.print(str.toString());
		br.close();
	}
}
