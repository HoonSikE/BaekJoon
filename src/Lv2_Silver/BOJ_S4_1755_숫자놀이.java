package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 수학, 문자열, 정렬
 * https://www.acmicpc.net/problem/1755
 */
public class BOJ_S4_1755_숫자놀이 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		String[] number = {	"Zero", "One", "Two", "Three", "Four", "Five",
				"Six", "Seven", "Eight", "Nine" };
		
		ArrayList<String> list = new ArrayList<>();
		for (int num = M; num <= N; num++) {
			String string = "";
			
			if(num/10 != 0)
				string = number[num/10] + " ";
			
			string += number[num%10];
			list.add(string);
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			String result = list.get(i).replace(" ", "");
			for (int index = 0; index < number.length; index++)
				result = result.replace(number[index], index + "");
			
			System.out.print(result + " ");
			if(i%10 == 9)
				System.out.println();
		}
	}
}
