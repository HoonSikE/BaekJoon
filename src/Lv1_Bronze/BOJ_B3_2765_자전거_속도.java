package Lv1_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/2765
 */
public class BOJ_B3_2765_자전거_속도 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();


        String s = br.readLine();
        int index = 1;

        while(s != null && !s.equals("")){
            st = new StringTokenizer(s);

            double r2 = Double.parseDouble(st.nextToken());
            int rotation = Integer.parseInt(st.nextToken());
            double second = Double.parseDouble(st.nextToken());

            if(rotation != 0) {
                double distance = r2*3.1415927 * rotation / 12 / 5280;
                double MPH = distance / (second/60/60);
                str.append("Trip #" + index++ + ": "
                        + String.format("%.2f", distance) + " "
                        + String.format("%.2f", MPH)).append("\n");
            }
            s = br.readLine();
        }

        System.out.print(str);
        br.close();
    }
}
