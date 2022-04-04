package Lv2_Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10157
 */
public class BOJ_S4_10157_자리배정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// CxR 크기의 공연장
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		// 관객 대기 번호
		int K = Integer.parseInt(br.readLine());
		// 관객 대기번호 > 좌석수인 경우 0을 출력
		if(K > C*R) {
			System.out.println(0);
			return;
		}
		// 초기값
		int x = 1, y = 0;
		int c_num = C-1, r_num = R;
		int state = 1;
		int cnt = 0;
		while(true) {
			// 이번 y축 이동에 좌석번호가 있다면 그 좌표를 구함
			if(K <= cnt+r_num) {
				y += (K-cnt)*state;
				break;
			}
			// 이번 y축 이동에 좌석번호가 없다면 y축 끝까지 이동
			y += r_num*state;
			cnt += r_num;
			//이번 x축 이동에 좌석번호가 있다면 그 좌표를 구함
			if(K <= cnt+c_num) {
				x += (K-cnt)*state;
				break;
			}
			// 이번 x축 이동에 좌석번호가 없다면 x축 끝까지 이동
			x += c_num*state;
			cnt += c_num;
			// 이동 크기 -1
			c_num--;
			r_num--;
			// 방향 전환
			state *= -1;
		}
		System.out.println(x + " " + y);
		br.close();
	}
}