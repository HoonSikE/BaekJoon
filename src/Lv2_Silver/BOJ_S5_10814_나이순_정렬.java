package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 정렬
 * https://www.acmicpc.net/problem/10814
 * 처음엔 어렵지만 반복 숙달하면 전혀 어렵지 않은 문제이다.
 */
public class BOJ_S5_10814_나이순_정렬 {
    // 클래스 생성
    // 방법 2: 클래스에서 implements Comparator<String>
    // @Override
    // public int Compare(Person p1, Person p2) { ... }
    public static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N줄에 걸쳐 온라인 회원 출력
        int N = Integer.parseInt(br.readLine());

        Person[] arr = new Person[N];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            arr[n] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        // 방법 1: Array.sort를 사용해 Compare 메서드를 ovveride하는 방법
        Arrays.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.age - p2.age;
            }
        });

        for(int i = 0; i < N; i ++)
            str.append(arr[i]);

        System.out.print(str);
        br.close();
    }
}
