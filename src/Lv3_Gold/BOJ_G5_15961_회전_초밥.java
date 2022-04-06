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
	static int d, c, count;
	static int result = Integer.MIN_VALUE;
	static int[] susi;
	static Queue<Integer> queue = new LinkedList<Integer>();
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void countSusi() {
		int tmp = queue.poll();
		queue.add(tmp);
		if(susi[tmp] == 0) {
			count++;
		}
		susi[tmp]++;
		result = Math.max(result, count);
		susi[tmp]--;
		count--;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N:접시의 수, d:초밥의 가짓수, k:연속해서 먹는 접시의 수, c:쿠폰번호
		int N = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++)
			queue.add(Integer.parseInt(br.readLine()));
		
		susi = new int[d+1];
		
		// 1~k번쨰 초밥을 먼저 먹음
		count = 0;
		for (int i = 0; i < k; i++) {
			int tmp = queue.poll();
			queue.add(tmp);
			list.add(tmp);
			if(susi[tmp] == 0)
				count++;
			susi[tmp]++;
		}
		// 쿠폰에 적힌 초밥을 먹음
		result = (susi[c] == 0) ? count+1 : count;
		if(--susi[list.get(0)] == 0)
			count--;
		
		for (int i = 1; i < N; i++)
			countSusi();
		
		System.out.println(result);
	}
}
