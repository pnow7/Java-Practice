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
        Queue<Integer> q = new ArrayDeque<>();
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
