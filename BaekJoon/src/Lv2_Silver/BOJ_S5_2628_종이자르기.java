package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 정렬
 * https://www.acmicpc.net/problem/2628
 */
public class BOJ_S5_2628_종이자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 종이의 가로길이
		int width = Integer.parseInt(st.nextToken());
		// 종이의 세로길이
		int height = Integer.parseInt(st.nextToken());
		// 칼로 잘라야하는 점선의 개수
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> widthCut = new ArrayList<>();
		ArrayList<Integer> heightCut = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 0: 가로, 1:세로
			int a = Integer.parseInt(st.nextToken());
			if(a == 0)
				widthCut.add(Integer.parseInt(st.nextToken()));
			else if(a == 1)
				heightCut.add(Integer.parseInt(st.nextToken()));
		}
		widthCut.add(0);
		widthCut.add(height);
		heightCut.add(0);
		heightCut.add(width);
		
		Collections.sort(widthCut);
		Collections.sort(heightCut);
		// 가로 자르기 후 최대 세로 길이
		int x = 0;
		int y = 0;
		for (int i = 1; i < widthCut.size(); i++) {
			int tmp = widthCut.get(i) - widthCut.get(i-1);
			y = y < tmp ? tmp : y;
		}
		// 세로 자르기 후 최대 가로 길이
		for (int i = 1; i < heightCut.size(); i++) {
			int tmp = heightCut.get(i) - heightCut.get(i-1);
			x = x < tmp ? tmp : x;
		}
		System.out.println(x*y);
		br.close();
	}
}
