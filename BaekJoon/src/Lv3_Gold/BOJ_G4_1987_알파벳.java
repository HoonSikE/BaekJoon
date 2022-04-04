package Lv3_Gold;
/*
 * 풀면서 배운 점
 * DFS 탐색은 동일하나 이중배열로 string값을 비교하는것보다 아스키 코드로 짰을 때 훨씬 효율적이었음.
 * string값 비교 	-> 메모리 : 295700 KB, 시간 : 3364 ms
 * 아스키값 사용 	-> 메모리 :  12432 KB, 시간 :  844 ms
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 깊이 우선 탐색(DFS), 백트래킹(Backtracking)
 * https://www.acmicpc.net/problem/1987
 */
public class BOJ_G4_1987_알파벳 {
	static int R, C, result = 0;
	static char[][] alphabet;
	static boolean[] isVisited;
	// 상, 하, 좌, 우
	static int[] dRow = {-1, 1, 0, 0};
	static int[] dCol = { 0, 0,-1, 1};
	
	public static void dfs(int Row, int Col, int count) {
		// 최대 이동값 최신화
		result = Math.max(result, count);
		// 상, 하, 좌, 우 이동
		for (int index = 0; index < 4; index++) {
			int now_Row = Row + dRow[index];
			int now_Col = Col + dCol[index];
			// 범위 내에 있고 || 해당 알파벳에 방문하지 않았다면 (방문확인시에 now값을 사용하기 때문에 무조건 마지막에 비교해줘야함)
			if(now_Row >= 0 && now_Row < R && now_Col >= 0 && now_Col < C && !isVisited[alphabet[now_Row][now_Col]-'A']) {
				// 다음 알파벳 true로 변경 -> dfs -> 알파벳 false로 변경
				isVisited[alphabet[now_Row][now_Col]-'A'] = true;
				dfs(now_Row, now_Col, count+1);
				isVisited[alphabet[now_Row][now_Col]-'A'] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// RxC 크기의 보드
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		alphabet = new char[R][C];
		// A~Z 크기의 알파벳 체크 배열 생성 및 입력
		isVisited = new boolean['Z'-'A'+1];
		for (int i = 0; i < R; i++)
			alphabet[i] = br.readLine().toCharArray();
		// (0,0) 지점의 알파벳 방문, count: 1부터 시작 초기값 설정
		isVisited[alphabet[0][0] - 'A'] = true;
		dfs(0,0, 1);
		System.out.println(result);
		br.close();
	}
}
