package study.algorithm.bfs_dfs.bfs;

/*
- 너비 우선 탐색 2

정점은 내림차순으로 방문

[입력]
5 5 1
1 4
1 2
2 3
2 4
3 4

[출력]
1
3
4
2
0

*/

import java.io.*;
import java.util.*;

public class BFS2 {

	static int[] order;
	static int count = 1;
	static ArrayList<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		order = new int[n + 1];
		graph = new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(graph[i], Collections.reverseOrder());
		}
		
		bfs(r);
		
		for (int i = 1; i <= n; i++) {
			sb.append(order[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void bfs(int startNode) {
		Queue<Integer> q = new ArrayDeque<>();
		
		q.offer(startNode);
		order[startNode] = count;
		
		while (!q.isEmpty()) {
			int currentNode = q.poll();
			
			for (int nextNode : graph[currentNode]) {
				if (order[nextNode] == 0) {
					count++;
					order[nextNode] = count;
					q.offer(nextNode);
				}
			}
		}
	}
	
}
