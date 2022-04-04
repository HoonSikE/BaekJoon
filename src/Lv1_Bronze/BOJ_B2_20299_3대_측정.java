package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/20299
 */
public class BOJ_B2_20299_3대_측정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 첫줄 N, K, L 입력 (space를 기준으로 토큰을 나눔)
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N : 신청한 팀의 수, 토큰을 int형으로 변경해준다., 범위 확인
		int N = Integer.parseInt(st.nextToken());
		if(!(1<=N&&N<=500000)) { System.out.println("1<=N<=500,000 범위를 초과했습니다."); return;}
		// K : 팀원 3명의 코드포스 레이딩의 합에 대한 VIP 클럽 가입조건, 토큰을 int형으로 변경해준다., 범위 확인
		int K = Integer.parseInt(st.nextToken());
		if(!(0<=K&&K<=12000)) { System.out.println("0<=K<=12,000 범위를 초과했습니다."); return;}
		// L : 개인 레이팅에 대한 VIP클럽 최소 가입조건, 토큰을 int형으로 변경해준다., 범위 확인
		int L = Integer.parseInt(st.nextToken());
		if(!(0<=L&&L<=4000)) { System.out.println("0<=L<=4,000 범위를 초과했습니다."); return;}
		
		// 가입가능한 팀 수
		int cnt = 0;
		// 팀 수 N만큼 반복
		for (int i = 0; i < N; i++) {
			int[] arr = new int[3];
			int sum = 0;
			st = new StringTokenizer(br.readLine(), " ");
			// 팀원수 3명의 능력치 입력, 범위 확인
			for (int j = 0; j < 3; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(!(0<=arr[j]&&arr[j]<=4000)) { System.out.println("0<=능력치<=4,000 범위를 초과했습니다."); return;}
				sum += arr[j];
			}
			// 3명의 능력치 합 > 팀 가입조건(K) && 모든 인원 개인 능력치 > 개인 최소 가입조건(L)
			// 조건 부합시 가입가능한 팀 수+1(cnt++), str에 입력 순서대로 값 입력
			if((sum>=K)&&(arr[0]>=L)&&(arr[1]>=L)&&(arr[2]>=L)) {
				cnt++;
				str.append(arr[0]).append(" ");
				str.append(arr[1]).append(" ");
				str.append(arr[2]).append(" ");
			}
		}
		// VIP클럽 가입 가능한 팀 수
		System.out.println(cnt);
		// stringbuilder에 저장된 VIP클럽에 가입된 팀원들의 능력치 출력
		System.out.print(str);
		// BufferedReader 종료
		br.close();
	}
}
