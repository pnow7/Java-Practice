package study.algorithm.dfs;

/*
[입력]
3 1

[출력]
1
2
3

[입력]
4 2

[출력]
1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3

*/

import java.io.*;
import java.util.*;

public class DFS2 {
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}

}

/*

백트래킹이란 어떤 노드의 유망성을 판단한 뒤, 
해당 노드가 유망하지 않다면 부모 노드로 돌아가 다른 자식 노드를 찾는 알고리즘이다.
(모든 경우의 수를 찾되, 그중에서 가능성 있는 경우의 수만 찾아보는 방법)

백트래킹은 DFS로 풀 수 있다.

문제에서 n과 m이 주어지고, 중복되는 수를 제외한 모든 경우의 수를 탐색하면 된다. 
그럼 기본적으로 재귀를 통해 풀어볼 수 있다.

이때, 재귀를 하면서 이미 방문한 노드라면 
다음 노드를 탐색하도록 하기 위해(유망한 노드인지 검사하기 위해) 
n크기의 boolean배열(visit)과 
m크기의 탐색 과정에서의 값을 담을 int 배열(arr)을 생성한다.

depth를 통해 재귀가 깊어질 때마다 
depth를 1씩 증가시켜 m과 같아지면 더이상 재귀를 호출하지않고 
탐색과정 중 값을 담았던 arr 배열을 출력해주고 
return하는 역할을 한다.

for (int i = 0; i < n; i++) {
    // 해당 노드를 방문하지 않았다면
    if (!visit[i]) {
        visit[i] = true; // 해당 노드 방문상태 변경
        arr[depth] = i + 1; // 해당 깊이를 index로 하여 i+1 값 저장
        dfs(depth + 1);// 다음 자식 노드 방문 위해 depth 1 증가시키며 재귀 호출
        visit[i] = false; // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
   }
}


*/
