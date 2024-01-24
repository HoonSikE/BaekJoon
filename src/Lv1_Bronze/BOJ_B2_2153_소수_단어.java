package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 문자열, 정수론, 소수 판정
 * https://www.acmicpc.net/problem/2153
 */
public class BOJ_B2_2153_소수_단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        char[] arr = br.readLine().toCharArray();
        int sum = 0;

        for(int n = 0; n < arr.length; n++){
            if(arr[n] >= 'a' && arr[n] <= 'z'){
                sum += arr[n] - 'a' + 1;
            }
            if(arr[n] >= 'A' && arr[n] <= 'Z'){
                sum += arr[n] - 'A' + 27;
            }
        }

        boolean isPrime = false;

        for(int n = 2; n < sum; n++){
            if (sum % n == 0) {
                isPrime = true;
                break;
            }
        }

        if(isPrime){
            str.append("It is not a prime word.");
        }else{
            str.append("It is a prime word.");
        }

        System.out.print(str);
        br.close();
    }
}
