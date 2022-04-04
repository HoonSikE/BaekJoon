package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S1_1149_RGB거리 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		
	    int[][] price = new int[N + 1][4];
	    int[][] dp = new int[N + 1][4];


	    for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 3; j++) {
                price[i][j] = Integer.parseInt(st.nextToken());  
            }
        }
        
        for (int i = 1; i <= N; i++) {
            dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + price[i][1];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + price[i][2];
            dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + price[i][3];
        }
        
        int res = 987654321;
        for (int i = 1; i <= 3; i++) 
            res = Math.min(res, dp[N][i]);
        
        System.out.println(res);

/*
       int N = Integer.parseInt(br.readLine());
       int[][] dp = new int[N + 1][4];
        
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());  
            int g = Integer.parseInt(st.nextToken());  
            int b = Integer.parseInt(st.nextToken());  
            
            dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + r; 
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + g;
            dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + b;
        }
        
        int res = 987654321;
        for (int i = 1; i <= 3; i++) 
            res = Math.min(res, dp[N][i]);
*/
        
		br.close();
	}
}
