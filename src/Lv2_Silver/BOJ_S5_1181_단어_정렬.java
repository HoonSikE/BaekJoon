package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author HanHoon
 * @category 문자열, 정렬
 * https://www.acmicpc.net/problem/1181
 */
public class BOJ_S5_1181_단어_정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		// 단어의 개수
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++)
			arr[i] = br.readLine();
		// 배열을 사용자 정의로 세틍
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 길이가 같을떄는 오름차순 정렬
				if(o1.length() == o2.length())
					return o1.compareTo(o2);
				// 길이가 다르면 작은것 부터 정렬
				return o1.length()-o2.length();
			}
		});
		String tmp = "";
		for (String string : arr) {
			// 같은 문자열을 출력 생랼
			if(tmp.equals(string)) continue;
			str.append(string).append("\n");
			tmp = string;
		}
		System.out.println(str.toString());
		br.close();
	}
}
