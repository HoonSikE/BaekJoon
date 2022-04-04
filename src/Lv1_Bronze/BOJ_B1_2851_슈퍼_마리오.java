package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 브루트포스 알고리즘
 * https://www.acmicpc.net/problem/2851
 */
public class BOJ_B1_2851_슈퍼_마리오 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] score = new int[10];
		// 10개의 줄에 각각의 버섯의 점수가 주어진다.
		for (int i = 0; i < 10; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		int result = 0;
		// 100 되기 직전까지 버섯을 먹고 그 다음 버섯을 먹을지 말지 정한다.
		for (int i = 0; i < 10; i++) {
			if(result + score[i] <= 100)
				result += score[i];
			else {
				// 100이하 최대한 먹고 나서 다음 버섯을 먹었을때의 키가 100과 더 가깝거나 같을때 result값 수정
				if(Math.abs(100-result) >= Math.abs(100-(result+score[i])))
					result += score[i];
				break;
			}
		}
		System.out.println(result);
		br.close();
	}
}
