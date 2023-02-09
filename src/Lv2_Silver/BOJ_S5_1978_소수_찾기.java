package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 수학, 정수론, 소수 판정, 에라토스테네스의 체
 * https://www.acmicpc.net/problem/1978
 */
public class BOJ_S5_1978_소수_찾기 {
    static boolean[] prime;
    // 에라토스테네스의 체
    public static void getPrime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // 수의 개수 N
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        prime = new boolean[arr[N-1]+1];

        getPrime();

        int result = 0;

        for(int i = 0; i < N; i++)
            if(!prime[arr[i]])
                result++;

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
