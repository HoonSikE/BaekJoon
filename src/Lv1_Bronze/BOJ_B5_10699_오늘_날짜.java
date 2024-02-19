package Lv1_Bronze;

import java.io.*;
import java.time.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/10699
 */
public class BOJ_B5_10699_오늘_날짜 {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();

        str.append(LocalDate.now(ZoneId.of("UTC+0")));

        System.out.print(str);
    }
}
