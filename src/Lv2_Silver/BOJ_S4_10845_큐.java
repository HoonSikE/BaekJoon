package Lv2_Silver;

import java.io.*;
import java.util.*;

/**
 * @author HanHoon
 * @category 자료 구조, 큐
 * https://www.acmicpc.net/problem/10845
 */
public class BOJ_S4_10845_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        while(N --> 0){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            switch(s){
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(queue.pop()).append("\n");
                    break;
                case "size":
                    str.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        str.append(1).append("\n");
                    else
                        str.append(0).append("\n");
                    break;
                case "front":
                    if(queue.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(queue.get(0)).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty())
                        str.append(-1).append("\n");
                    else
                        str.append(queue.get(queue.size()-1)).append("\n");
                    break;
            }
        }
        System.out.print(str);
        br.close();
    }
}
