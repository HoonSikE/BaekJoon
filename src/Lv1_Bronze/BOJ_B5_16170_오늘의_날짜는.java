package Lv1_Bronze;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/16170
 */
public class BOJ_B5_16170_오늘의_날짜는 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // UTC+0 기준으로 현재 시간 가져오기
        LocalDateTime utcNow = LocalDateTime.now(ZoneOffset.UTC);

        str.append(utcNow.format(DateTimeFormatter.ofPattern("yyyy"))).append("\n");
        str.append(utcNow.format(DateTimeFormatter.ofPattern("MM"))).append("\n");
        str.append(utcNow.format(DateTimeFormatter.ofPattern("dd")));

        System.out.print(str);
        br.close();
    }
}
