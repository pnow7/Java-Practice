package test.test11.test1126;

/*

[입력]
6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

6 4
0 -1 0 0 0 0
-1 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

2 2
1 -1
-1 1

5 5
-1 1 0 0 0
0 -1 -1 -1 0
0 -1 -1 -1 0
0 -1 -1 -1 0
0 0 0 0 0

[출력]
8

-1

0

14

*/

import java.io.*;
import java.util.*;

public class Main7576_Refactor {
	
	private static int[][] box;
	
	private static final int[] DX = {-1, 1, 0, 0};
	private static final int[] DY = {0, 0, -1, 1};

	private static class Tomato {
		int x;
		int y;

		// day 제거된 단순 좌표만 갖는 Tomato
		Tomato(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Tomato> q = new ArrayDeque<>();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		box = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 익은 토마토의 day를 0으로 설정
				if (box[i][j] == 1) {
					box[i][j] = 0;
					q.offer(new Tomato(i, j));
				}
			}
		}
		
		bfs(q);
		
		int maxDay = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) { // 아직 안 익은 토마토
					System.out.println(-1);
					return;
				}
				maxDay = Math.max(maxDay, box[i][j]);
			}
		}
		
		// 처음 익은 토마토가 1이었으므로 실제 날짜는 (maxDay - 1)
		System.out.println(maxDay - 1);
		br.close();
	}
	
	private static void bfs(Queue<Tomato> q) {
		while (!q.isEmpty()) {
			Tomato current = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = current.x + DX[i];
				int ny = current.y + DY[i];
				
				if (0 <= nx && nx < box.length && 0 <= ny && ny < box[0].length) {
					// 날짜를 box에 직접 기록하는 방식
					if (box[nx][ny] == 0) { 
						box[nx][ny] = box[current.x][current.y] + 1;  
						q.offer(new Tomato(nx, ny));
					}
				}
			}

		}
	}

}