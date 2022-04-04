package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = null;
//		st = new StringTokenizer(br.readLine(), " ");
		
//		double y = 3, x = 3;
//		double y = -3, x = 3;
		double y = 3, x = -3;
//		double y = -3, x = -3;
		
		double radian1 = Math.atan(y/x);
		double radian2 = Math.atan2(y, x);
		
		double angle11 = radian1 * (180 / Math.PI);
		double angle12 = Math.toDegrees(radian1);
		double angle21 = radian2 * (180 / Math.PI);
		double angle22 = Math.toDegrees(radian2);
		
		System.out.println(angle11 + " " + angle12);
		System.out.println(angle21 + " " + angle22);
	}
}
