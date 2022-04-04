package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 자료 구조, 브루트포스 알고리즘, 스택
 * https://www.acmicpc.net/problem/2304
 */
class Storage implements Comparable<Storage>{
	int L;
	int H;
	public Storage(int l, int h) {
		L = l;
		H = h;
	}
	@Override
	public int compareTo(Storage o) {
		return this.L - o.L;
	}
}
public class BOJ_S2_2304_창고_다각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 기둥의 개수
		int N = Integer.parseInt(br.readLine());
		// 지붕 list
		ArrayList<Storage> list = new ArrayList<>();
		// 지붕의 최대 높이
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 기둥의 위치 
			int L = Integer.parseInt(st.nextToken());
			// 기둥의 높이
			int H = Integer.parseInt(st.nextToken());
			// 지붕의 최대높이 갱신
			max = max < H ? H : max;
			// list에 기둥의 정보를 담음
			list.add(new Storage(L, H));
		}
		// 기둥 순서대로 정렬
		Collections.sort(list);
		int result = 0;
		// 첫번쨰 기둥 정보 저장
		Storage tmp = list.get(0);
		// 가장 높은 기둥이 2개가 있을 수도 있다는 점에 주의하자.
		int lastIndex = 0;
		// max 기준 좌측
		for (int i = 1; i < list.size(); i++) {
			if(tmp.H <= list.get(i).H) {
				result += (list.get(i).L - tmp.L) * tmp.H;
				tmp = list.get(i);
				lastIndex = i;
			}
		}
		// 마지막 기둥 정보 저장
		tmp = list.get(list.size()-1);
		// max 기준 우측
		for (int i = list.size()-2; i >= lastIndex; i--) {
			if(tmp.H <= list.get(i).H) {
				result += (tmp.L - list.get(i).L) * tmp.H;
				tmp = list.get(i);
			}
		}
		// 제일 높은 기둥 높이 더함.
		result += max;
		
		System.out.println(result);
		br.close();
	}
}
