package study.algorithm.bfs_dfs;

/*

- DFS와 BFS

[입력]
4 5 1
1 2
1 3
1 4
2 4
3 4

[출력]
1 2 4 3
1 2 3 4

*/

import java.io.*;
import java.util.*;

public class DFS_BFS {
    
    static int N;
    static int M;
    static boolean[] visitedBfs;
    static boolean[] visitedDfs;
    static List<Integer>[] graph;
    static Queue<Integer> q = new ArrayDeque<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());
        
        // 배열 0번 버리기
        visitedBfs = new boolean[N + 1];
        visitedDfs = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0 ; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        DFS(startNode);
        System.out.println();

        BFS(startNode);

        br.close();
    }

    static void DFS(int nodeIndex) {
        visitedDfs[nodeIndex] = true;

        System.out.print(nodeIndex + " ");

        for (int nextNode : graph[nodeIndex]) {
            if(!visitedDfs[nextNode]) {
                DFS(nextNode);
            }
        }
    }

    static void BFS(int nodeIndex) {
        q.offer(nodeIndex);
        visitedBfs[nodeIndex] = true;

        while (!q.isEmpty()) {
            int currentNode = q.poll();

            System.out.print(currentNode + " ");

            for (int nextNode : graph[currentNode]) {
                if (!visitedBfs[nextNode]) {
                    visitedBfs[nextNode] = true;
                    q.offer(nextNode);                
                }
            }
        }
    }
    
}

/*

[*공통*]
: 인자값으로 들어간 값은 단순하면 한두번 쓰이고 다른경우(좌표 등)일때는 인자값을 활용하여 한두번 쓰임 
=> 인자값은 잘 안쓰임

- DFS (모든 구간을 효율적으로 탐색 하고 싶을 때 - 재귀)
> 모든 경로 탐색: 가능한 모든 경우의 수 확인 / 백트래킹
> 정답이 여러 개 / 모든 경우를 확인할때: 조합, 순열, 부분집합
> 그래프 연결 요소 파악: 단지번호붙이기, 섬 개수 세기
> 깊이가 깊어도 상관없는 문제: 재귀 활용
> 사이클 탐색: 그래프 순환 확인

- BFS (효율적으로 빨리 구하고 싶을 때)
> 최단 거리 구하기: 이동 최소 횟수, 최소 비용
> 가장 가까운 해를 빨리 찾아야 할 때: 조기 종료 가능
> 가중치가 없는 그래프의 최단 경로: 모든 간선 비용이 동일한 경우
> 레벨 단위 탐색: depth별 탐색 필요

*/