package test.test11.test1126;

/*
- 토마토

토마토 농장에는 토마토를 보관하는 큰 창고
격자 모양 상자의 칸에 하나씩 넣어서 창고에 보관

보관 후 하루가 지나면, 
익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들이 익은 토마토의 영향을 받아 익게됨 
하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미
대각선 방향에 있는 토마토들에게는 영향을 주지 못함.

며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램

상자 크기 두 정수 M, N
M은 상자의 가로 칸수
N은 상자의 세로 칸수

1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸

토마토가 모두 익을 때까지의 최소 날짜 출력
만약, 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력
토마토가 모두 익지 못하는 상황이면 -1 출력

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

[출력]
8

-1

*/

import java.io.*;
import java.util.*;

public class Main7576 {
	
	private static int[][] box;
	
	private static final int[] DX = {-1, 1, 0, 0};
	private static final int[] DY = {0, 0, -1, 1};
	private static int maxDay = 0;
	
	private static class Tomato {
		int x;
		int y;
		int day;
		
		Tomato(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
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
				if (box[i][j] == 1) {
					q.offer(new Tomato(i,j, 0));
				}
			}
		}
		
		bfs(q);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(maxDay);
		br.close();
	}
	
	private static void bfs(Queue<Tomato> q) {
		while(!q.isEmpty()) {
			Tomato current = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = current.x + DX[i];
				int ny = current.y + DY[i];
				
				if (0 <= nx && nx < box.length && 0 <= ny && ny < box[0].length) {
					if (box[nx][ny] == 0) {
						box[nx][ny] = 1;
						q.offer(new Tomato(nx, ny, current.day + 1));
					}
				}
			}
			
			maxDay = Math.max(maxDay, current.day);
		}
	}

}
