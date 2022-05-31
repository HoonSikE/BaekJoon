import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputGenerator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		System.out.println("**********TC 생성 프로그램(InputGenerator.java)*************");
		System.out.println("===============================================");
		System.out.println("TC 구성");
		System.out.println("T(반복 횟수)");
		System.out.println("=======이하 항목 구간 반복=======");
		System.out.println("10x10 map");
		System.out.println("B(방귀 농도) C(청정기 파워)");
		System.out.println("S(시간)");
		System.out.println("=======================예시======================");
		System.out.println("1");
		System.out.println("1 0 0 0 0 0 0 0 0 0");
		System.out.println("0 3 0 0 0 0 0 0 0 0");
		System.out.println("0 3 0 0 0 0 0 0 0 0");
		System.out.println("0 3 3 3 0 0 0 0 0 0");
		System.out.println("0 3 0 0 0 0 0 3 0 0");
		System.out.println("0 3 0 0 0 0 0 3 0 0");
		System.out.println("0 0 0 0 0 0 0 3 0 0");
		System.out.println("0 0 0 0 0 3 3 0 0 0");
		System.out.println("0 0 0 0 0 0 0 0 0 0");
		System.out.println("0 0 0 0 0 0 0 0 0 2");
		System.out.println("12 19");
		System.out.println("3");
		System.out.println("===============================================");
		System.out.print("반복횟수를 입력하세요 : ");
		int T = Integer.parseInt(br.readLine());
		
		str.append(T).append("\n");
		
		for (int testcase = 0; testcase < T; testcase++) {
			/*******************10x10 map Start!!!*********************/
			int[][] map = new int[10][10];
			// 임의의 벽 생성
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = (int)(Math.random()*2) * 3;
				}
			}
			// 랜덤 위치 변수
			int tmp_x = (int)(Math.random()*10);
			int tmp_y = (int)(Math.random()*10);
			// 뿡뿡이 랜덤 위치
			map[tmp_x][tmp_y] = 1;

			// 청정기 랜덤 위치 (뿡붕이가 있다면 새로운 위치 선정)
			while(true) {
				// 랜덤 위치 변수
				tmp_x = (int)(Math.random()*10);
				tmp_y = (int)(Math.random()*10);
				// 뿡뿡이의 위치라면 다시 랜덤 위치 선정
				if(map[tmp_x][tmp_y] == 1)
					continue;
				// 뿡뿡이가 아니라면 이자리가 청정기 자리!!!!
				map[tmp_x][tmp_y] = 2;
				break;
			}
			
			// 10x10 map 출력
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					str.append(map[i][j]).append(" ");
				}
				str.append("\n");
			}
			/*******************10x10 map End!!!*********************/
			// B(방귀 농도) 1~30 
			str.append((int)(Math.random()*30)+1).append(" ");
			// C(청정기 파워) 1~30 
			str.append((int)(Math.random()*30)+1).append("\n");
			// S(시간) 0~5 
			str.append((int)(Math.random()*6)).append("\n");
		}
		System.out.print(str);
		br.close();
	}
}
