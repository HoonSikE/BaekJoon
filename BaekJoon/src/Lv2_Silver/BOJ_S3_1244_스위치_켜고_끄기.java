package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/1244
 */
public class BOJ_S3_1244_스위치_켜고_끄기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// N : 스위치의 개수
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] sw = new int[N];
		for (int i = 0; i < N; i++)
			sw[i] = Integer.parseInt(st.nextToken());
		// S : 학생의 수
		int S = Integer.parseInt(br.readLine());
		for (int i = 0; i < S; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 1: 남학생, 2: 여학생
			int gender = Integer.parseInt(st.nextToken());
			if(gender == 1) {
				int num = Integer.parseInt(st.nextToken());
				// num의 배수마다 toggle
				for (int j = num-1; j < N; j+= num) {
					sw[j] = sw[j] == 1 ? 0 : 1;
				}
			}else if(gender ==2) {
				int num = Integer.parseInt(st.nextToken())-1;
				// 처음 중앙값 toggle
				sw[num] = sw[num] == 1 ? 0 : 1;
				for (int j = 1; j < N/2+1; j++) {
					// 범위에서 벗어나면 break;
					if(num-j < 0 || num+j >= N) break;
					// 대칭한다면 toggle
					if(sw[num+j] == sw[num-j]) {
						sw[num+j] = sw[num+j] == 1 ? 0 : 1;
						sw[num-j] = sw[num-j] == 1 ? 0 : 1;
					// 대칭하지 않는다면 break;
					}else break;
				}
			}
		}
		// 출력하되, 20개씩 끊어서 출력
		int count = 0;
		for (int arr : sw) {
			System.out.print(arr + " ");
			count++;
			if(count == 20) {
				System.out.println();
				count = 0;
			}
		}
		br.close();
	}
}

