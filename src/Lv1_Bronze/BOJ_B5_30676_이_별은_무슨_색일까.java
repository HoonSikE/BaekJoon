package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/30676
 */
public class BOJ_B5_30676_이_별은_무슨_색일까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        if(620 <= N && N <= 780)
            str.append("Red");
        else if(590 <= N && N < 620)
            str.append("Orange");
        else if(570 <= N && N < 590)
            str.append("Yellow");
        else if(495 <= N && N < 570)
            str.append("Green");
        else if(450 <= N && N < 495)
            str.append("Blue");
        else if(425 <= N && N < 450)
            str.append("Indigo");
        else if(380 <= N && N < 425)
            str.append("Violet");

        System.out.print(str);
        br.close();
    }
}
