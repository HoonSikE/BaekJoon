import java.util.Scanner;
 https://st-lab.tistory.com/150
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(T-- > 0) {
			int N = in.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
            
			/*
			 same this
			 if(N > max) max = N;
			 if(N < min) min = N;
			*/
		}
		System.out.println(max * min);
	}
 
}