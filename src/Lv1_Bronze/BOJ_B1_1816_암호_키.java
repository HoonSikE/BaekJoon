package Lv1_Bronze;

import java.io.*;
import java.util.ArrayList;

/**
 * @author HanHoon
 * @category 수학, 브루트포스 알고리즘, 정수론
 * https://www.acmicpc.net/problem/1816
 */
public class BOJ_B1_1816_암호_키 {
    static long S;
    static Integer[] prime;
    static ArrayList<Integer> listPrime;
    static void getPrime(int n){
        for(int i = 2; i < n; i++) {
            if(prime[i] == null){
                prime[i] = 1;
                listPrime.add(i);
                for(int j = i+i; j < n; j += i) {
                    prime[j] = -1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        prime = new Integer[1000001];
        prime[0] = -1;
        prime[1] = -1;
        listPrime = new ArrayList<>();

        getPrime(1000001);

        for (int n = 0; n < N; n++){
            S = Long.parseLong(br.readLine());

            boolean answer = true;
            for(int p : listPrime){
                if(S%p == 0){
                    answer = false;
                }
            }

            if(answer){
                str.append("YES\n");
            }else{
                str.append("NO\n");
            }
        }
        System.out.print(str);
        br.close();
    }
}
