package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/15686
 */
class Point{
	int y, x;
	public Point(int y, int x) {
		this.y = y;
		this.x = x;
	}
}
public class BOJ_G5_15686_치킨_배달 {
	static int N, M;
	static int sum, answer = Integer.MAX_VALUE;	
	// 집 위치, 치킨 집 위치 저장
	static ArrayList<Point> house = new ArrayList<>();
	static ArrayList<Point> chicken = new ArrayList<>();
	// 집에서 가장 가까운 치킨집의 거리
	static int getDistance(Point house, List<Point> selecChi) {
		int min = Integer.MAX_VALUE;
		for (Point point : selecChi)
			min = Math.min(min, Math.abs(house.y-point.y)+Math.abs(house.x-point.x));
		return min;
	}
	static void combination(int count, int start, List<Point> selecChi) {
		// M개의 치킨집을 골랐다면 return;
		if(count==M) {
			// 모든 집에 서 가장 가까운 치킨집
			int sum = 0;
			for (Point point : house)
				sum += getDistance(point, selecChi);
			// 거리 최소값 최신화
			answer = Math.min(answer, sum);
			return;
		}
		for (int i = start; i < chicken.size(); i++) {
			selecChi.add(chicken.get(i));
			combination(count+1, i+1, selecChi);
			selecChi.remove(selecChi.size()-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N : 도시의 크기, M : 치킨집 최대개수
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		// NxN의 도시 데이터 입력
		// 0 : 빈칸, 1 : 집, 2 : 치킨집
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if(temp == 1)
					house.add(new Point(i, j));
				else if(temp == 2)
					chicken.add(new Point(i, j));
			}
		}
		combination(0, 0, new ArrayList<>());
		System.out.println(answer);
		br.close();
	}
}