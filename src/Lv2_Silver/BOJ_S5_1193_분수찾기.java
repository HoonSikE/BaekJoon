package Lv2_Silver;

import java.io.*;
public class BOJ_S5_1193_분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // X번째 분수를 구하는 프로그램을 작성하시오.
        int X = Integer.parseInt(br.readLine());
        /**
         * 1, 2, 3, 4, 5, ... 순으로 등차수열의 형태를 보인다.
         */
        int range = 1;
        int toggle = 1;

        while(range < X){
            X -= range;
            // 방향 바꿔주고, 다음 칸으로
            toggle *= -1;
            range++;
        }

        int a = range-X+1;
        int b = range+1-a;

        if(toggle == 1)
            str.append(a).append("/").append(b);
        else
            str.append(b).append("/").append(a);

        System.out.println(str);
        br.close();
    }
}
