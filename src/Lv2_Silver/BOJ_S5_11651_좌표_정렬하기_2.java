package Lv2_Silver;

import java.io.*;
import java.util.*;
/**
 * @author HanHoon
 * @category 정렬
 * https://www.acmicpc.net/problem/11651
 */
public class BOJ_S5_11651_좌표_정렬하기_2 {
    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() { return x + " " + y + "\n"; }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N개의 점
        int N = Integer.parseInt(br.readLine());

        Point[] arr = new Point[N];

        for (int t = 0; t < N; t++){
            st = new StringTokenizer(br.readLine());
            arr[t] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, new Comparator<Point>(){
            @Override
            public int compare(Point p1, Point p2){
                if(p1.y == p2.y)
                    return p1.x - p2.x;
                return p1.y - p2.y;
            }
        });

        for(Point p : arr)
            str.append(p);

        System.out.print(str);
        br.close();
    }
}
