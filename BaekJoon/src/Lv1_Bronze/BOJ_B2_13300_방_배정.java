package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 구현
 * https://www.acmicpc.net/problem/13300
 */
public class BOJ_B2_13300_방_배정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 수학여행 참가하는 학생 수
		int N = Integer.parseInt(st.nextToken());
		// 한방에 배정될 수 있는 최대 인원 수
		int K = Integer.parseInt(st.nextToken());
		
		int[][] student = new int[2][6];
		// 학생 데이터 입력 (성별, 학년)
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			student[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())-1]++;
		}
		// 방의 개수
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				count += student[i][j]/K;
				if(student[i][j]%K !=0)
					count++;
			}
		}
		System.out.println(count);
	}
}
