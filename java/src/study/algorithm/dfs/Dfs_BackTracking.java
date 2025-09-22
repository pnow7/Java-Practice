package study.algorithm.dfs;

public class Dfs_BackTracking {

	private static boolean[] visited;
	private static int[][] graph;
	private static int[] arr;
	private static int N = 4;
	private static int M = 4;
	
	private static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) {
		
		// DFS 예시용 그래프 구성
	    graph = new int[][] {
	        {},         // index 0은 사용하지 않음 (1-based)
	        {2, 3},     // 1번 노드 -> 2, 3
	        {1, 4},     // 2번 노드 -> 1, 4
	        {1},        // 3번 노드 -> 1
	        {2}         // 4번 노드 -> 2
	    };
	    
	    // 노드 수 + 1
	    visited = new boolean[5]; 
	    
	    System.out.println("== DFS 탐색 (1번 노드부터) ==");
	    dfs(1);  // DFS 탐색 실행
	    System.out.println("\n\n==========================================\n");

	    // 백트래킹용 배열 초기화 (N 크기)
	    arr = new int[N];
	    
	    // 백트래킹 예시: 0~2 숫자로 이루어진 순열 생성
	    visited = new boolean[N];

	    System.out.println("== 백트래킹 순열 생성 ==");
	    dfs_backtracking1(N, M, 0);
	    System.out.println(sb.toString());
	    sb.setLength(0); // 출력 후 초기화
	    
	    System.out.println("== 백트래킹 중복순열 생성 ==");
	    dfs_backtracking2(N, M, 0);
	    System.out.println(sb.toString());
	    sb.setLength(0);

	    System.out.println("== 백트래킹 조합 생성 ==");
	    dfs_backtracking3(1, 0);
	    System.out.println(sb.toString());
	    sb.setLength(0);

	    System.out.println("== 백트래킹 중복조합 생성 ==");
	    dfs_backtracking4(1, 0);
	    System.out.println(sb.toString());
	    sb.setLength(0);
	}

	// DFS: 그래프 탐색
	public static void dfs(int node) {
		visited[node] = true;
		// 방문 노드 출력
		System.out.print(node + " "); 

		for (int next : graph[node]) {
			if (!visited[next]) {
				dfs(next);
			}
		}
	}

	// 백트래킹: 순열 
	public static void dfs_backtracking1(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs_backtracking1(N, M, depth + 1);
				visited[i] = false;
			}
		}
	}
	
	// 백트랙킹: 중복 순열
	public static void dfs_backtracking2(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		// 중복이 가능하기 때문에 방문확인 여부를 할 필요가 없다 
		for(int i = 0; i < N; i++) {
			arr[depth] = i + 1;
			dfs_backtracking2(N, M, depth + 1);
	
		}
	}
	
	// 백트래킹: 조합
	public static void dfs_backtracking3(int at, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs_backtracking3(i+1, depth+1); // i+1로 증가 (중복 허용 X)
		}
	}
	
	// 백트랙킹: 중복 조합
	public static void dfs_backtracking4(int at, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs_backtracking4(i, depth + 1); // i 그대로 (중복 허용하기 때문에)
		}
	}
}


/*
① dfs(1)
방문: 1 출력

graph[1] = {2, 3} → 먼저 2를 탐색

② dfs(2)
방문: 2 출력

graph[2] = {1, 4} → 1은 이미 방문 → 4 탐색

③ dfs(4)
방문: 4 출력

graph[4] = {2} → 2는 이미 방문 → 더 이상 탐색할 노드 없음

(이제 dfs(4) → dfs(2)로 복귀)

복귀 후, dfs(2)는 끝났고 → dfs(1)로 복귀
아직 graph[1] = {2, 3} 중 3이 남음 → 3 탐색

*/