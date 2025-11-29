package study.algorithm.bfs_dfs.dfs;

/*
- 유기농 배추

1	1	0	0	0	0	0	0	0	0
0	1	0	0	0	0	0	0	0	0
0	0	0	0	1	0	0	0	0	0
0	0	0	0	1	0	0	0	0	0
0	0	1	1	0	0	0	1	1	1
0	0	0	0	1	0	0	1	1	1

0은 배추 X
1은 배추 O

최소 5마리의 배추흰지렁이 필요

입력: 
첫 줄에는 테스트 케이스 개수 T

첫째 줄에는 
배추를 심은 배추밭의 가로길이 M(1 <= M <= 50), 
세로길이 N(1 <= N <= 50),
배추가 심어져 있는 위치의 개수 K(1 <= K <= 2500)

그 다음 K줄
배추의 위치 X(0 <= X <= M - 1),
Y(0 <= Y <= N - 1)가 주어진다.

두 배추의 위치가 같은 경우는 없음

[입력]
2
10 8 17
0 0
1 0
1 1
4 2
4 3
4 5
2 4
3 4
7 4
8 4
9 4
7 5
8 5
9 5
7 6
8 6
9 6
10 10 1
5 5

[출력]
5
1

*/

import java.io.*;
import java.util.*;

public class DFS_LandCabbage {

	static int[][] land;
	static boolean[][] visited;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			land = new int[m][n];
			visited = new boolean[m][n];
			
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				land[x][y] = 1;
			}
			
			count = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (land[i][j] == 1 && visited[i][j] == false) {
						dfs(i, j);
						count++;
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void dfs(int x, int y) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if ((0 <= nx && nx < land.length) && (0 <= ny && ny < land[0].length)) {
				if (visited[nx][ny] == false && land[nx][ny] == 1) {
					visited[nx][ny] = true;
					dfs(nx, ny);
				}
			}
		}
	}
	
}
