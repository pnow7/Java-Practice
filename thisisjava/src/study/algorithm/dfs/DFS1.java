package study.algorithm.dfs;

public class DFS1 {
	//방문처리에 사용 할 배열선언
	static boolean[] visited = new boolean[9];
	static int[][] tree = {
			{}, 
			{2,3,8}, 
			{1,6,8},
			{1,5},
			{5,7},
			{3,4,7},
			{2},
			{4,5},
			{1,2}
	};

	public static void main(String[] args) {
		dfs(7); //정수 부터 시작
	}
	
	static void dfs(int nodeIndex) {
		//방문처리
		visited[nodeIndex] = true; 
		
		//방문 노드 출력
		System.out.print(nodeIndex+" -> ");
		//방문한 노드에 인접한 노드 찾기
		for(int node : tree[nodeIndex]) {
			//인접한 노드가 방문한 적이 없다면 DFS수행
			if(!visited[node]) {
				dfs(node);
			}
		}
	}

}
