package Lv1_Bronze;

import java.io.*;
import java.util.ArrayList;

/**
 * @author HanHoon
 * @category 구현, 문자열
 * https://www.acmicpc.net/problem/29731
 */
public class BOJ_B5_29731_2033년_밈_투표 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        list.add("Never gonna give you up");
        list.add("Never gonna let you down");
        list.add("Never gonna run around and desert you");
        list.add("Never gonna make you cry");
        list.add("Never gonna say goodbye");
        list.add("Never gonna tell a lie and hurt you");
        list.add("Never gonna stop");

        String result = "No";
        for (int n = 0; n < N; n++){
            if(!list.contains(br.readLine())){
                result = "Yes";
                break;
            }
        }

        str.append(result);
        System.out.print(str);
        br.close();
    }
}
