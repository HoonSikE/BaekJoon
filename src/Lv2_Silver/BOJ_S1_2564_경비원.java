package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 많은 조건 분기
 * https://www.acmicpc.net/problem/2564
 */
public class BOJ_S1_2564_경비원 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine(), " ");
		// HxW 크기의  map
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		// 상점개수(T)
		int T = Integer.parseInt(br.readLine());
		int[][] store = new int[T][2];
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 첫번쨰 수 -> 1:북, 2:남, 3:서, 4:동
			store[tc][0] = Integer.parseInt(st.nextToken());
			// 두번째 수 -> 블록으로부터 좌/상 으로부터의 거리
			store[tc][1] = Integer.parseInt(st.nextToken());
		}
		// 동근이의 위치
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		// 동근이 위치에서 상점간 최소 거리의 합
		for (int tc = 0; tc < T; tc++) {
			switch(store[tc][0]) {
			// 상점 위치가 북일 때
			case 1:
				switch(A) {
				// 동근이의 위치가 북일때
				case 1:
					sum += Math.abs(store[tc][1] - B);
					break;
				// 동근이의 위치가 남일때
				case 2:
					sum += Math.min(2*W - (store[tc][1] + B), store[tc][1] + B) + H;
					break;
				// 동근이의 위치가 서일때
				case 3:
					sum += store[tc][1] + B;
					break;
				// 동근이의 위치가 동일때
				case 4:
					sum += (W-store[tc][1]) + B;
					break;
				}
				break;
			// 상점 위치가 남일 때
			case 2:
				switch(A) {
				// 동근이의 위치가 북일때
				case 1:
					sum += Math.min(2*W - (store[tc][1] + B), store[tc][1] + B) + H;
					break;
				// 동근이의 위치가 남일때
				case 2:
					sum += Math.abs(store[tc][1] - B);
					break;
				// 동근이의 위치가 서일때
				case 3:
					sum += store[tc][1] + (H-B);
					break;
				// 동근이의 위치가 동일때
				case 4:
					sum += (W-store[tc][1]) + (H-B);
					break;
				}
				break;
			// 상점 위치가 서일 때
			case 3:
				switch(A) {
				// 동근이의 위치가 북일때
				case 1:
					sum += store[tc][1] + B;
					break;
				// 동근이의 위치가 남일때
				case 2:
					sum += (H-store[tc][1]) + B;
					break;
				// 동근이의 위치가 서일때
				case 3:
					sum += Math.abs(store[tc][1] - B);
					break;
				// 동근이의 위치가 동일때
				case 4:
					sum += Math.min(2*H - (store[tc][1] + B), store[tc][1] + B) + W;
					break;
				}
				break;
			// 상점 위치가 동일 때			
			case 4: 
				switch(A) {
				// 동근이의 위치가 북일때
				case 1:
					sum += store[tc][1] + (W-B);
					break;
				// 동근이의 위치가 남일때
				case 2:
					sum += (H-store[tc][1]) + (W-B);
					break;
				// 동근이의 위치가 서일때
				case 3:
					sum += Math.min(2*H - (store[tc][1] + B), store[tc][1] + B) + W;
					break;
				// 동근이의 위치가 동일때
				case 4:
					sum += Math.abs(store[tc][1]-B);
					break;
				}
				break;
			default: break;
			}
		}
		System.out.println(sum);
		br.close();
	}
}
