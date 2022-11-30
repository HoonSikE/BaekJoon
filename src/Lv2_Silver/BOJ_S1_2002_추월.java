package Lv2_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author HanHoon
 * @category 구현, 자료 구조, 문자열, 해시를 사용한 집합과 맵
 * https://www.acmicpc.net/problem/2002
 */
public class BOJ_S1_2002_추월 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int result = 0;
        
        // N개의 라인
        int N = Integer.parseInt(br.readLine());

        // 차례대로 들어가는 N개의 차량 Input
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            map.put(tmp, i);
        }
        // 터널을 빠져나오는 차량에 원래 순번을 입력
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = map.get(br.readLine());
        }

        // 차량 순서대로 확인
        for (int i = 0; i < N-1; i++) {
            // 뒷 차량 중 나보다 순번이 낮은 차량이 있다면 추월차량으로 판정
            for (int j = i+1; j < N; j++) {
                if(arr[i] > arr[j]) {
                    result++;
                    break;
                }
            }
        }

        str.append(result);
        System.out.println(str.toString());

        map.clear();
        br.close();
    }
}
