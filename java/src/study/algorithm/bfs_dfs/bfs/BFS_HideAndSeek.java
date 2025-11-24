package study.algorithm.bfs_dfs.bfs;

/*
- 숨바꼭질

수빈이는 현재 점 N(0 <= N <= 100,000)에 있고
동생은 점K(0 <= K <= 100,000)에 있다.

수빈이는 걷거나 순간이동을 할 수 있음.
만약 수빈이의 위치가 X 일때 걷는다면 1초 후에
X - 1, X + 1로 이동하게 된다.

순간이동을 하는 경우에는 1초 후에 2 x X의 위치로 이동하게 됨.

수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램 작성

[입력]
5 17

[출력]
4

*/

import java.io.*;
import java.util.*;

public class BFS_HideAndSeek {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		bfs(n, k);
		br.close();
	}
	
	static void bfs(int startNode, int endNode) {
		Deque<Integer> q = new ArrayDeque<>();
		
		// 방문전 세팅
		int[] time = new int[100001];
		Arrays.fill(time, -1);
		
		time[startNode] = 0;
		q.offer(startNode);
		
		while (!q.isEmpty()) {
			int currentNode = q.poll();
			int[] count = {currentNode - 1, currentNode + 1, currentNode * 2};
			
			// 찾으면 종료
			if (currentNode == endNode) break;
			
			for (int nextNode : count) {
				if (0 <= nextNode && nextNode <= 100000) {
					if (time[nextNode] == -1) {
						time[nextNode] = time[currentNode] + 1;
						q.offer(nextNode);
					} 
				}
			}
		}
		
		System.out.println(time[endNode]);
	}
	
}
