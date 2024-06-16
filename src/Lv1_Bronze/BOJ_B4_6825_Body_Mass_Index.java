package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 수학, 사칙연산
 * https://www.acmicpc.net/problem/6825
 */
public class BOJ_B4_6825_Body_Mass_Index {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        double W = Double.parseDouble(br.readLine());
        double H = Double.parseDouble(br.readLine());

        double BMI = W/(H*H);

        if(BMI >= 25.0)
            str.append("Overweight");
        else if(BMI >= 18.5 && BMI < 25.0)
            str.append("Normal weight");
        else if(BMI < 18.5)
            str.append("Underweight");

        System.out.print(str);
        br.close();
    }
}
