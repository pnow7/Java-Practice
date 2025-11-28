package study.algorithm.bfs_dfs.bfs;

/*
- 뱀과 사다리 게임

주사위를 조작해 원하는 수가 나오게 만들 수 있다면, 
최소 몇 번만에 도착점에 도착할 수 있을까? -> BFS

정육면체 주사위 사용(1 ~ 6)
크기가 10 x 10, 총 100칸이 있는 보드판에서 진행
보드판에는 1부터 100까지 수가 순서대로 적혀 있음.

플레이어는 주사위를 굴려 나온 수만큼 이동
플레이어가 i번 칸에 있고, 주사위를 굴려 나온 수가 4라면, i + 4번 칸으로 이동
주사위를 굴린 결과가 100번 칸을 넘어간다면 이동할 수 없음.

도착한 칸이 사다리면, 사다리를 타고 위로 올라감.
뱀이 있는 칸에 도착하면, 뱀을 따라서 내려가게 됨.
사다리를 이용해 칸의 번호는 원래 있던 칸의 번호보다 크고, 
뱀을 이용해 이동한 칸의 번호는 원래 있던 칸의 번호보다 작아짐

게임의 목표: 번 칸에서 시작해서 100번 칸에 도착하는 것.

100번 칸에 도착하기 위해 주사위를 굴려야 하는 횟수의 최솟값 구하기.

첫째 줄에 게임판에 있는 사다리의 수 N (1 <= N <= 15), 뱀의 수 M (1 <= M <= 15)
둘째 줄부터 N개의 줄에는 사다리의 정보 x, y (x < y) 주어짐.
x번 칸에 도착하면, y번 칸으로 이동

다음 M개의 줄에는 뱀의 정보 u, v (u > v)가 주어짐.
u번 칸에 도착하면 v번 칸으로 이동

1번 칸과 100번 칸은 뱀과 사다리의 시작 또는 끝이 아님.
모든 칸은 최대 하나의 사다리 또는 뱀을 가지고 있고, 동시에 두 가지를 모두 가지고 가는 경우는 없음.
항상 100번 칸에 도착할 수 있는 입력만 주어짐.

[입력]
3 7
32 62
42 68
12 98
95 13
97 25
93 37
79 27
75 19
49 47
67 17

[출력]
3

=> 5를 굴려 6으로 이동. 6을 굴려 12로 이동. 12는 98로 이동하는 사다리를 통해 98로 이동. 2를 굴려 100으로 이동.

*/

import java.io.*;
import java.util.*;

public class BFS_SnakesAndLaddersGame {

	private static int[] board;
	private static boolean[] visited;
	
	private static class Node {
		int position;
		int depth; // 주사위를 몇 번 굴렸는지
		
		Node (int position, int depth) {
			this.position = position;
			this.depth = depth;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		board = new int[101];
		visited = new boolean[101];
		
		for (int i = 1; i < 101; i++) {
			board[i] = i;
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			board[x] = y;
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			board[u] = v;
		}
		
		System.out.println(bfs());
		br.close();
	}
	
	private static int bfs() {
		Queue<Node> q = new ArrayDeque<>();

		q.offer(new Node(1, 0));
		visited[1] = true;
		
		while(!q.isEmpty()) {
			Node currentNode = q.poll();
			int position = currentNode.position;
			int depth = currentNode.depth;
			
			if (position == 100) return depth;
			
			for (int i = 1; i <= 6; i ++) {
				int next = position + i;
				
				if (next > 100) continue;
				
				next = board[next];
				
				if (visited[next] == false) {
					visited[next] = true;
					q.offer(new Node(next, depth + 1));
				}
			}
		}
		
		return 0;
	}

}