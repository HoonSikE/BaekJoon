import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/1157
 */
public class boj3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 대문자 알파벳 크기의 배열
		int[] arr = new int['Z' - 'A' + 1];
		String s = br.readLine();
		// 알파벳의 사용 횟수 측정
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			// 소문자라면 대문자로 변환해서 기록
			int index = 'A';
			if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
				index = 'a';
			arr[s.charAt(i) - index]++;
			max = Math.max(max, arr[s.charAt(i)- index]); 
		}
		// 대문자 중 가장 많이 사용된 알파벳
		boolean flag = false;
		char result = '?';
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				if(flag) {
					result = '?';
					break;
				}
				flag = true;
				result = (char)(i + 'A');
			}
		}

         //input
         Scanner scanner = new Scanner(System.in);
         int[] cnt = new int[6];
         int[] full = new int[]{1, 1, 2, 2, 2, 8};
         for (int i = 0; i < 6; i++) {
             cnt[i] = scanner.nextInt();
         }

         for (int i = 0; i < full.length; i++) {
             cnt[i] = full[i] - cnt[i];
             System.out.println(cnt[i]);
         }
     }
		System.out.println(result);
		br.close();
	}
}
