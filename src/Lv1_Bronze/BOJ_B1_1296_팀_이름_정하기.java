package Lv1_Bronze;

import java.io.*;
import java.util.Arrays;

/**
 * @author HanHoon
 * @category 구현, 문자열, 정렬
 * https://www.acmicpc.net/problem/1296
 */
public class BOJ_B1_1296_팀_이름_정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String S = br.readLine();
        String LOVE = "LOVE";

        // N
        int N = Integer.parseInt(br.readLine());

        int Max = Integer.MIN_VALUE;
        String Winner = "";

        for (int n = 0; n < N; n++){
            String name = br.readLine();

            int[] value = new int[4];

            for(int i = 0; i < LOVE.length(); i++){
                value[i] = S.length() - S.replace(LOVE.charAt(i)+"", "").length();
                value[i] += name.length() - name.replace(LOVE.charAt(i)+"", "").length();
            }

            int score = 1;
            for(int i = 0; i < value.length; i++){
                for(int j = i+1; j < value.length; j++){
                    score *= value[i]+value[j];
                }
                score %= 100;
            }

            if(Max == score && !Winner.equals("")){
                String[] tmp = new String[2];
                tmp[0] = Winner;
                tmp[1] = name;
                Arrays.sort(tmp);
                Winner = tmp[0];
            }else if(Max < score){
                Max = score;
                Winner = name;
            }
        }

        str.append(Winner);

        System.out.print(str);
        br.close();
    }
}
