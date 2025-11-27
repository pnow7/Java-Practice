package test.test11.test1127;

/*
- 토마토 3차원

토마토에 인접한 곳은 위, 아래, 왼쪽, 오른쪽, 앞, 뒤 여섯 방향

첫 줄에는 상자의 크기를 나타내는 두 정수 M, N과
쌓아올려지는 상자의 수를 나타내는 H가 주어짐
M은 상자의 가로 칸의 수 (2 <= M <= 100),
N은 상자의 세로 칸의 수 (2 <= N <= 100),
H는 상자의 수 (1 <= H <= 100)

토마토가 모두 익을 때까지 최소 며칠이 걸리는지 계산
저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력
토마토가 모두 익지 못하는 상황이면 -1 출력

[입력]
5 3 1
0 -1 0 0 0
-1 -1 0 1 1
0 0 0 1 1

5 3 2
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0

[출력]
-1

4

*/

import java.io.*;
import java.util.*;

public class Main7569 {
	
	private static int[][][] box;
	private static int maxDay = 0;
	
	private static final int[] DX = {0, 0, -1, 1, 0, 0};
	private static final int[] DY = {0, 0, 0, 0, -1, 1};
	private static final int[] DZ = {-1, 1, 0, 0, 0, 0};
	
	private static Deque<TomatoBox> q = new ArrayDeque<>();
	
	private static class TomatoBox {
		int x, y, z, day;
		
		TomatoBox (int x, int y, int z, int day) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.day = day;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		box = new int[n][m][h];
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < m; k++) {
					int tomato = Integer.parseInt(st.nextToken());
					box[j][k][i] = tomato;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (box[j][k][i] == 1) {
						q.offer(new TomatoBox(j, k, i, 0));
					}
				}
			}
		}
		
		bfs(q);
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (box[j][k][i] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		
		System.out.println(maxDay);
		br.close();
	}
	
	private static void bfs(Queue<TomatoBox> q) {
		while (!q.isEmpty()) {
			TomatoBox currentNode = q.poll();
			
			for (int i = 0; i < 6; i++) {
				int nx = currentNode.x + DX[i];
				int ny = currentNode.y + DY[i];
				int nz = currentNode.z + DZ[i];
				
				if (0 <= nx && nx < box.length && 0 <= ny && ny < box[0].length && 0 <= nz && nz < box[0][0].length) {
					if (box[nx][ny][nz] == 0) {
						box[nx][ny][nz] = 1;
						q.offer(new TomatoBox(nx, ny, nz, currentNode.day + 1));
					}
				}
			}
			
			maxDay = Math.max(maxDay, currentNode.day);
		}
	}
	
}
