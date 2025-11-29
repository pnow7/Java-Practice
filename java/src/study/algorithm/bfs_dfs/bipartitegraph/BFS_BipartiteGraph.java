package study.algorithm.bfs_dfs.bipartitegraph;

/*
- 이분 그래프

그래프의 정점의 집합을 둘로 분할
각 집합에 속한 정점끼리는 서로 인접하지 않도록 분할할 수 있을 때 => 이분 그래프
그래프가 입력으로 주어졌을 때, 이 그래프가 이분 그래프인지 아닌지 판별하는 프로그램 작성

테스트 케이스 개수 K
테스트 케이스의 첫째 줄에는 
그래프의 정점의 개수 V와 간선의 개수 E가 빈 칸을 사이에 두고 순서대로 주어짐

각 정점에는 1부터 V까지 차례로 번호가 붙어 있음.
이어서 둘째 줄부터 E개의 줄에 걸쳐 간선에 대한 정보가 주어짐
각 줄에 인전합 두 정점의 번호 u, v가 빈 칸을 사이에 두고 주어짐

[입력]
2		// 테스트 케이스 K

3 2		// 정점의 개수 V, 간선의 개수 E (정점에는 1부터 V까지 차례로 번호가 붙어있음)
1 3		// E개의 줄에 걸쳐 간선에 대한 정보 (u, v)
2 3		// u, v

4 4		// (테스트 케이스 K2) 정점의 개수 V, 간선의 개수 E 
1 2		// E개의 줄에 걸쳐 간선에 대한 정보 (u, v)
2 3		// 
3 4
4 2

[입력]
2
3 2
1 3
2 3
4 4
1 2
2 3
3 4
4 2

[출력]
YES
NO

*/

import java.io.*;
import java.util.*;

public class BFS_BipartiteGraph {

	// 0: 미방문, 그룹1: 1, 그룹2: 2
	private static int[] color;
	private static ArrayList<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int k = Integer.parseInt(br.readLine());
		
		while (k-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			color = new int[v + 1];
			graph = new ArrayList[v + 1];
			
			for (int i = 1; i <= v; i++) {
				graph[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < e; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()); 
				int y = Integer.parseInt(st.nextToken());
				
				graph[x].add(y);
				graph[y].add(x);
			}
			
			boolean isBipartite = true;
			
			for (int i = 1; i < v + 1; i++) {
				if (color[i] == 0) {
					if (!bfs(i)) {
						isBipartite = false;
						break;
					}
				}
			}
			
			sb.append(isBipartite ? "YES" : "NO").append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	private static boolean bfs(int start) {
		Queue<Integer> q = new ArrayDeque<>();
		
		color[start] = 1;
		q.offer(start);
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			int nextColor = (color[cur] == 1) ? 2 : 1;
				
			for (int next : graph[cur]) {
				// 인접 정점 색이 동일하면 이분 그래프가 아님
				if (color[next] == color[cur]) return false;
				
				if (color[next] == 0) {
					// 이분 그래프에서는 어떤 방식이든 간에 반대 색을 줘야함. 
					// color[next] = 1; -> X
					color[next] = nextColor;
					q.offer(next);
				}
			}
		}
		
		return true;
	}
	
}
