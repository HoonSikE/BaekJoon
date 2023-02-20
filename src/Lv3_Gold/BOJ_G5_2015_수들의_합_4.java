package Lv3_Gold;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 자료 구조, 누적 합, 트리를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/2015
 */
public class BOJ_G5_2015_수들의_합_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 수
		int N = Integer.parseInt(st.nextToken());
		// 합이 K인 숫자
		int K = Integer.parseInt(st.nextToken());
		long result = 0;

		Map<Integer, Long> map = new HashMap<>();
		int[] arr = new int[N+1];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			// 부분합 구하기
			arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];

			if(arr[i] == K)
				result++;

			if(map.containsKey(arr[i] - K))
				result += map.get(arr[i] - K);

			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1l);
			else
				map.put(arr[i], map.get(arr[i]) + 1);
		}

		System.out.println(result);
		br.close();
	}
}
