package study.algorithm.bfs_dfs.bfs;

/*
- 벽 부수고 이동하기

N x M 행렬로 표현되는 맵이 있음
0은 이동할 수 있는 곳을 나타내고
1은 이동할 수 없는 벽이 있는 곳을 나타냄.
(1, 1)에서 (N, M)의 위치까지 이동하려 하는데, 이때 최단 경로로 이동
이때 시작하는 칸과 끝나는 칸도 포함해서 셈

만약에 이동하는 도중에 한 개의 벽을 부수고 이동하는 것이 좀 더 경로가 짧아진다면
벽을 한 개 까지 부수고 이동 가능
한 칸에서 이동할 수 있는 칸은 상하좌우로 인접한 칸

불가능할 때는 -1 출력

[입력]
6 4
0100
1110
1000
0000
0111
0000

[출력]
15

*/

import java.io.*;
import java.util.*;

public class BFS_BreakTheWallAndMove {

	private static final int[] DX = {-1, 1, 0, 0};
	private static final int[] DY = {0, 0, -1, 1};
	
	private static int[][] map;
	private static boolean[][][] visited;
	private static int n, m;
	
	// 0: 벽 안 부숨, 1: 벽 한 번 부숨
	private static class Node {
		int x, y, dist;
		int broken;
		
		Node(int x, int y, int dist, int  broken) {
			this.x = x;
			this.y = y;
			this.dist = dist;
			this.broken = broken;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m][2];
		
		for (int i = 0; i < n; i++) {
			String num = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = num.charAt(j) - '0';
			}
		}
		
		System.out.println(bfs());
		br.close();
	}
	
	private static int bfs() {
		Queue<Node> q = new ArrayDeque<>();
		
		// q.offer(new int[]{0, 0, 1, 0});
		q.offer(new Node(0, 0, 1, 0));
		visited[0][0][0] = true;
		
		while (!q.isEmpty()) {
			Node cur = q.poll();
			
			if (cur.x == n - 1 && cur.y == m -1) return cur.dist;
			
			for (int i = 0; i < 4; i++) {
				int nx = cur.x + DX[i];
				int ny = cur.y + DY[i];
				
				// if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue; 
				// if (0 <= nx && nx < n && 0 <= ny && ny < m) 중괄호 쓰기 싫으면 위에 코드
				
				if (0 <= nx && nx < n && 0 <= ny && ny < m) {
					// 다른 칸 벽 && 아직 부셔지지 않음
					if (map[nx][ny] == 1 && cur.broken == 0) {
						if (visited[nx][ny][1] == false) {
							visited[nx][ny][1] = true;
							q.offer(new Node(nx, ny, cur.dist + 1, 1));
						}
					// 다음 칸이 빈칸
					} else if (map[nx][ny] == 0) {
						if (visited[nx][ny][cur.broken] == false) {
							visited[nx][ny][cur.broken] = true;
							q.offer(new Node(nx, ny, cur.dist + 1, cur.broken));
						}
					}
				}
			}
		}
		
		return -1;
	}
	
}