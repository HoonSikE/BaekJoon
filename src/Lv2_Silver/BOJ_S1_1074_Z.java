package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 분할 정복, 재귀
 * https://www.acmicpc.net/problem/1074
 */
public class BOJ_S1_1074_Z {
	static int count = 0;
	public static void searchIndex(int size, int r, int c) {
		if(size == 1) return;
		
		if(r < size/2 && c < size/2) {
			searchIndex(size/2, r, c);
		}else if(r < size/2 && c >= size/2) {
			count += size*size/4;
			searchIndex(size/2, r, c-size/2);
		}else if(r >= size/2 && c < size/2) {
			count += size*size/2;
			searchIndex(size/2, r-size/2, c);
		}else {
//			count += size*size*3/4;
			count += (size*size/4)*3;
			searchIndex(size/2, r-size/2, c-size/2);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N : 2^Nx2^N 크기의 배열, r:행, c:열
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		// Math.pow(a,b) : a^b를 double로 표현
		int powN = (int)Math.pow(2, N);

		searchIndex(powN, R, C);
		
		System.out.println(count);
		
		br.close();
	}
}
