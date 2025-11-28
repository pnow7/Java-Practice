package test.test11.test1128;

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

public class Main2206 {

	private static int[][] map;
	private static boolean[][] visited;
	
	private static class Node {
		int x;
		int y;
		
		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String num = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = num.charAt(j) - '0';
			}
		}
		
		
	}
	
}
