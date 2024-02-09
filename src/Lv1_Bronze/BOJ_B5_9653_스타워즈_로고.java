package Lv1_Bronze;

import java.io.*;

/**
 * @author HanHoon
 * @category 구현
 * https://www.acmicpc.net/problem/9653
 */
public class BOJ_B5_9653_스타워즈_로고 {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();

        str.append("    8888888888  888    88888\n" +
                "   88     88   88 88   88  88\n" +
                "    8888  88  88   88  88888\n" +
                "       88 88 888888888 88   88\n" +
                "88888888  88 88     88 88    888888\n" +
                "\n" +
                "88  88  88   888    88888    888888\n" +
                "88  88  88  88 88   88  88  88\n" +
                "88 8888 88 88   88  88888    8888\n" +
                " 888  888 888888888 88  88      88\n" +
                "  88  88  88     88 88   88888888");

        System.out.print(str);
    }
}
