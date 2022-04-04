package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/2941
 */
public class BOJ_S5_2941_크로아티아_알파벳 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine().replace("c=", "0").replace("c-", "0")
				.replace("dz=", "0").replace("d-", "0").replace("lj", "0")
				.replace("nj", "0").replace("s=", "0").replace("z=", "0");
		
		System.out.println(str.length());

		br.close();
	}
}
