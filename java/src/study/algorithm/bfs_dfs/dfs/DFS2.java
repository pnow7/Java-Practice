package study.algorithm.bfs_dfs.dfs;

/*
- 깊이 우선 탐색 1

정점번호를 오름차순

[입력]
5 5 1
1 4
1 2
2 3
2 4
3 4

[출력]
1
2
3
4
0

*/

import java.io.*;
import java.util.*;

public class DFS2 {
	
	static List<Integer>[] graph;
	static int[] order;
	static int count = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N + 1];
		order = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < M; i++ ) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph[i]);
		}
		
		DFS(R);
		
		for (int i = 1; i <= N; i++) {
			sb.append(order[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void DFS(int startNode) {
		order[startNode] = count;
		
		for (int nextNode : graph[startNode]) {
			if (order[nextNode] == 0) {
				count++;
				DFS(nextNode);
			}
		}
	}
	
}
