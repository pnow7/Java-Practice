package study.algorithm.bfs_dfs.dfs;

/*
- 단지번호붙이기

1은 집이 있는 곳
0은 집이 없는 곳

연결된 집의 모임인 단지를 정의
단지에 번호를 붙이려 함

연결되었다는 것은 어떤 집이 좌우, 
혹은 아래위로 다른 집이 있는 경우를 말함.

대각선상에 집이 있는 경우는 연결된 것이 아님.
지도를 입력하여 단지수를 출력하고,
각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력

[입력]
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000

[출력]
3
7
8
9
*/

import java.io.*;
import java.util.*;

public class DFS_NumberingHouses {

	static boolean[][] visited;
	static int[][] house;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n][n];
		house = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String num = br.readLine();
			for (int j = 0; j < n; j++) {
				// house[i][j] = Integer.parseInt(String.valueOf(num.charAt(j));
				house[i][j] = num.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (house[i][j] == 1 && visited[i][j] == false) {
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		
		sb.append(list.size()).append("\n");
		for (int result : list) {
			sb.append(result).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void dfs(int x, int y) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		visited[x][y] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if ((0 <= nx && nx < house.length) && (0 <= ny && ny < house.length)) { 
				if (house[nx][ny] == 1 && visited[nx][ny] == false) {
					visited[nx][ny] = true;
					dfs(nx, ny);
				}
			}
		}
	}
	
}
