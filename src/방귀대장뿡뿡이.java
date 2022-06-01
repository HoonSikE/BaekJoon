import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 방귀대장뿡뿡이 {
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int TC = (Integer.parseInt(br.readLine()));
      
      int[] dr = {-1,1,0,0};
      int[] dc = {0,0,-1,1};
      
      
      
      
      for(int tc=1;tc<=TC;tc++) {
         StringTokenizer st;
         
         //해당 칸을 방문했는지 확인하는 boolean형 배열 visited
         boolean[][] visited = new boolean[10][10];
         //교실 구조를 받는 배열 map
         int [][] map = new int[10][10];
         //교실의 오염도를 측정하는 배열 bmap
         int [][] bmap = new int[10][10];
         //교실의 정화도를 측정하는 배열 cmap
         int [][] cmap = new int[10][10];
         
         //뿡뿡이의 위치
         int[] bpos = new int[2];
         //공기청정기의 위치
         int[] cpos = new int[2];
         
         int result = 0;
         //지도를 읽어들이는 부분
         for(int i=0;i<10;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++) {
               map[i][j] = Integer.parseInt(st.nextToken());
               //현재 위치가 뿡뿡이가 있는 위치라면 해당 좌표를 뿡뿡이의 위치로 저장한다.
               if(map[i][j] == 1) {
                  bpos[0] = i;
                  bpos[1] = j;
               }
               //현재 위치가 공기청정기가 있는 위치라면 해당 좌표를 공기청정기의 위치로 저장한다.
               if(map[i][j] == 2) {
                  cpos[0]=i;
                  cpos[1]=j;
               }
            }
         }
         
         st = new StringTokenizer(br.readLine());
         //방귀의 냄새
         int B = Integer.parseInt(st.nextToken());
         //공기청정기의 청정능력
         int C = Integer.parseInt(st.nextToken());
         //경과시간
         int S = Integer.parseInt(br.readLine());
         
         //방귀 확산을 먼저 한다.
         Queue<int[]> bqueue = new LinkedList<int[]>();
         bmap[bpos[0]][bpos[1]] = B;
         result += B;
         visited[bpos[0]][bpos[1]] = true;
         bqueue.add(bpos);
         while(!bqueue.isEmpty()) {
            int[] temp = bqueue.poll();
            for(int i=0;i<4;i++) {
               int nr = temp[0] + dr[i];
               int nc = temp[1] + dc[i];
               
               if(nr>=0 && nr<10 && nc>=0 && nc<10 && map[nr][nc] !=3 & !visited[nr][nc] && bmap[temp[0]][temp[1]]>1) {
                  visited[nr][nc] = true;
                  bmap[nr][nc] = bmap[temp[0]][temp[1]]-1;
                  result += bmap[nr][nc];
                  bqueue.add(new int[]{nr,nc});
               }
            }
         }
         
         for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++)
               visited[i][j] = false;
         }
         
         
         
         //청정기의 시간별 정화도를 구한다.
         Queue<int[]> cqueue = new LinkedList<int[]>();
         cmap[cpos[0]][cpos[1]] = C;
         visited[cpos[0]][cpos[1]] = true;
         cqueue.add(cpos);
         
         while(!cqueue.isEmpty()) {
            int[] temp = cqueue.poll();
            for(int i=0;i<4;i++) {
               int nr = temp[0] + dr[i];
               int nc = temp[1] + dc[i];
               
               if(nr>=0 && nr<10 && nc>=0 && nc<10 && map[nr][nc] !=3 & !visited[nr][nc] && cmap[temp[0]][temp[1]]>1) {
                  visited[nr][nc] = true;
                  cmap[nr][nc] = cmap[temp[0]][temp[1]]-1;
                  cqueue.add(new int[]{nr,nc});
               }
            }
         }
         
         for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
               //방귀 농도가 0이거나 청정기 정화력이 0인곳에서는 계산을 해줄 필요가 없다.
               if(bmap[i][j] == 0 || cmap[i][j] == 0) continue;
               //나머지 계산
               else {
                  if(bmap[i][j] - (cmap[i][j]*S)>=0) {
                     result -= (cmap[i][j]*S);
                  }else {
                     result -= bmap[i][j];
                  }
               }
            }
         }
         
         System.out.println("#"+tc+" "+result);
         
      }
   }
}