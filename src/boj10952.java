import java.util.Scanner;
 https://st-lab.tistory.com/39
public class Main {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
				
		while(true){
		
			int A=in.nextInt();
			int B=in.nextInt();
		
			if(A==0 && B==0){
				in.close();
				break;
			}
			System.out.println(A+B);
		}
	}
}