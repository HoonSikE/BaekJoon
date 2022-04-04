package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 이분탐색, 누적 합
 * https://www.acmicpc.net/problem/3020
 */
public class BOJ_G5_3020_개똥벌레_binary {
	// h 높이에 존재하는 장애물의 개수 구하기
	static int binarySearch(int left, int right, int h, int[] arr) {
		// left<right가 끝나면 search가 끝난것이다.
		while(left<right) {
			int mid = (left+right)/2;
			// 중간의 값이 찾는값보다 같거나 크면 좌측 탐색
			// 중복된 값 존재시 가장 좌측의 수를 구한다.
			if(arr[mid] >=h)
				right = mid;
			// 중간값보다 찾는값이 작으면 우측 탐색
			else
				left = mid+1;
		}
		// h높이이상의 장애물 개수 -> blocking 개수
		return arr.length-right;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 동굴의 길이 (항상 짝수)
		int N = Integer.parseInt(st.nextToken());
		// 동굴의 높이
		int H = Integer.parseInt(st.nextToken());
		// 높이별 장애물의 개수
		int[] down = new int[N/2];
		int[] up = new int[N/2];
		// 첫 장애물은 석순
		for (int i = 0; i < N/2; i++) {
			// 종유석과 석순이 번갈아 가면서 등장
			down[i] = Integer.parseInt(br.readLine());
			up[i] = Integer.parseInt(br.readLine());
		}
		// binarySearch를 하려면 sort를 해줘야한다.
		Arrays.sort(up);
		Arrays.sort(down);
		// 초기값 설정
		int min_num = N;
		int count = 0;
		
		// 장애물의 최솟값과 구간의 수를 찾아서 출력
		for (int index = 1; index < H+1; index++) {
			// down의 경우 정상적으로 계산, up의 경우 H-index+1의 높이를 계산해줘야한다.
			int temp = binarySearch(0, N/2, index, down) + binarySearch(0, N/2, H-index+1, up);
			if(temp < min_num) {
				min_num = temp;
				count = 1;
			}else if(temp == min_num)
				count++;
		}
		System.out.println(min_num + " " + count);
		br.close();
	}
}
