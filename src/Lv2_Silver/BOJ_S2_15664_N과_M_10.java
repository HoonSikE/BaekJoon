package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 백트래킹
 * https://www.acmicpc.net/problem/15664
 */
public class BOJ_S2_15664_N과_M_10 {
	static int num[], result[];
	/*
	 * HashSet은 Set 인터페이스의 구현 클래스로 중복값을 자동으로 제거해준다.
	 * 기본적으로 저장 순서를 유지해주지 않지만, 유지를 해야한다면 LinkedHashSet을 사용하면 된다.
	 * 중복제거 과정에 의해 List 구조에 비해 느리다는 단점이 있다.
	 * LinkedHashSet -> 값 추가: .add(""), 삭제: remove("");, 초기화: .clear();
	 */
	static LinkedHashSet<String> ans = new LinkedHashSet<>();
	public static void backtracking(int cnt, int start, int N, int M) {
		if(cnt == M) {
			StringBuilder str = new StringBuilder();
			for (int num : result)
				str.append(num + " ");
			// LinkedHashSet 값 추가
			ans.add(str.toString());
			return;
		}
		for (int i = start; i < N; i++) {
			result[cnt] = num[i];
			backtracking(cnt+1, i+1, N, M);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N개의 자연수
		int N = Integer.parseInt(st.nextToken());
		num = new int[N];
		// M : 수열의 길이
		int M = Integer.parseInt(st.nextToken());
		result = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			num[i] = Integer.parseInt(st.nextToken()); 
		
		Arrays.sort(num);
		
		backtracking(0, 0, N, M);
		// hashmap 출력 방법 1
		/*Iterator<String> iter = ans.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		// hashmap 출력 방법 2
		ans.forEach(System.out::println);
		// hashmap 출력 방법 3
		/*for (String string : ans) {
			System.out.println(string);
		}*/
		br.close();
	}
}
