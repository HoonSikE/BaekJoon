package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 정렬, 스위핑
 * https://www.acmicpc.net/problem/2170
 */
class Line implements Comparable<Line>{
	int start;
	int end;
	public Line(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Line o) {
		return this.start - o.start;
	}
}
public class BOJ_G5_2170_선_긋기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());
		ArrayList<Line> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			list.add(new Line(start, end));
		}
		Collections.sort(list);
		int start = list.get(0).start;
		int end = list.get(0).end;
		int result = end-start;
		for (Line line : list) {
			// 중복되는 선은 continue
			if(line.end <= end) continue;
			// 라인이 이어진다면 추가되는 부분만 더함.
			if(line.start < end)
				result += line.end - end;
			// 라인이 끊긴다면 새로 그어준다.
			else
				result += line.end - line.start;
			// 새로 그은 선의 정보를 넣어준다.
			start = line.start;
			end = line.end;
		}
		System.out.println(result);
		br.close();
	}
}