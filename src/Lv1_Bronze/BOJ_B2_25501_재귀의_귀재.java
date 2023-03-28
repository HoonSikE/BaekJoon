package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현, 문자열, 재귀
 * https://www.acmicpc.net/problem/25501
 */
public class BOJ_B2_25501_재귀의_귀재 {
    static int result;
    public static int recursion(String s, int l, int r){
        result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // T: 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        for (int n = 0; n < T; n++){
            result = 0;
            str.append(isPalindrome(br.readLine())+" "+result).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
