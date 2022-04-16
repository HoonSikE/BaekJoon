package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 정렬, 이분탐색, 누적 합
 * https://www.acmicpc.net/problem/3020
 */
public class BOJ_G5_3020_개똥벌레 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 동굴의 길이 (항상 짝수)
		int N = Integer.parseInt(st.nextToken());
		// 동굴의 높이
		int H = Integer.parseInt(st.nextToken());
		// 높이별 장애물의 개수
		int[] down = new int[H];
		int[] up = new int[H];
		// 첫 장애물은 석순
		for (int i = 0; i < N; i+=2) {
			// 종유석과 석순이 번갈아 가면서 등장
			down[Integer.parseInt(br.readLine())-1]++;
			up[Integer.parseInt(br.readLine())-1]++;
		}
		int[] down_sum = new int[H];
		int[] up_sum = new int[H];
		// 길이가 H일때의 개수를 추가한다.
		down_sum[H-1] = down[H-1];
		up_sum[0] = up[H-1];
		// 길이별로 최대 blocking되는 숫자를 구해준다.
		for (int i = H-2; i >= 0; i--)
			down_sum[i] = down_sum[i+1] + down[i];
		for (int i = 1; i < H; i++)
			up_sum[i] = up_sum[i-1] + up[H-1-i];
		
		// 장애물의 최솟값과 구간의 수를 찾아서 출력
		int min_num = Integer.MAX_VALUE;
		int count = 0;
		for (int index = 0; index < H; index++) {
			int temp = down_sum[index] + up_sum[index];
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
