package Lv3_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 구현, 시뮬레이션
 * https://www.acmicpc.net/problem/14719
 */
class RainWater{
    int index;
    int height;

    public RainWater(int index, int height){
        this.index = index;
        this.height = height;
    }
}

public class BOJ_G5_14719_빗물 {
    public static int[] map;
    public static RainWater preLeft;
    public static RainWater preRight;
    
    public static int getStagnantWater(RainWater pre, RainWater current){
        int stagnantWater = 0;
        // 양 끝 최소 높이 판단
        int height = Math.min(pre.height, current.height);
        for (int n = pre.index+1; n < current.index; n++) {
            // 평지에 언덕만 솟아 있을 경우 예외 처리
            stagnantWater += height - map[n];
        }

        return stagnantWater;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder str = new StringBuilder();
        int result = 0;

        // 세로길이 H
        int H = Integer.parseInt(st.nextToken());
        // 가로길이 W
        int W = Integer.parseInt(st.nextToken());

        // W개의 숫자 출력
        map = new int[W];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            // Integer.parseInt(st.nextToken());
        }
        // 시작점
        preLeft = new RainWater(0,map[0]);
        preRight = new RainWater(W-1,map[W-1]);

        for (int i = 1; i < W; i++) {
            // 두개가 만나게 되면 끝
            if(preLeft.index >= preRight.index)
                break;
            // pre보다 같거나 높고, 바로 다음 높이가 떨어 진다면
            // 웅덩이로 판단하고 빗물양 계산. 
            if(preLeft.height <= map[i]){
                result += getStagnantWater(preLeft, new RainWater(i, map[i]));
                // 시작점 최신화
                preLeft = new RainWater(i, map[i]);
            }

            if(preRight.height <= map[(W-1)-i]){
                result += getStagnantWater(new RainWater((W-1)-i, map[(W-1)-i]), preRight);
                // 시작점 최신화
                preRight = new RainWater((W-1)-i, map[(W-1)-i]);
            }
            // pre보다 낮으면 그냥 지난다.
        }

        str.append(result);
        System.out.println(str.toString());
        br.close();
    }
}
