package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 두 포인터, 슬라이딩 윈도우 
 * https://www.acmicpc.net/problem/15961
 */
public class BOJ_G5_15961_회전_초밥 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N:접시의 수, d:초밥의 가짓수, k:연속해서 먹는 접시의 수, c:쿠폰번호
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		int[] sushi = new int[d+1];
		sushi[c]++;
		int count = 1;
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		// 먼저 0~k-1까지 
		for (int i = 0; i < k; i++)
			if(sushi[arr[i]]++==0)
				count++;
		
		int start = 0, end = k, result = count;
		
		while(start < N) {
			if(--sushi[arr[start++%N]]==0) count--;
			if(sushi[arr[end++%N]]++==0) count++;
			result = Math.max(result, count);
		}
		
		System.out.println(result);
	}
}
