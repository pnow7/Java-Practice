package study.algorithm.bfs_dfs.bfs;

import java.util.*;

public class BFS_Practice {
    
    static List<Integer>[] graph = new ArrayList[9];
    static boolean[] visited = new boolean[9];

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            graph[i] = new ArrayList<>();
        }

        // 순서대로
        graph[1].addAll(Arrays.asList(2, 3, 8));
        graph[2].addAll(Arrays.asList(1, 7));
        graph[3].addAll(Arrays.asList(1, 4, 5));
        graph[4].addAll(Arrays.asList(3, 5));
        graph[5].addAll(Arrays.asList(3, 4));
        graph[6].addAll(Arrays.asList(7, 8));
        graph[7].addAll(Arrays.asList(2, 6));
        graph[8].addAll(Arrays.asList(1, 6));

        int startNode = 1;
        System.out.println("BFS 탐색 순서: " + startNode);
        
        bfs(startNode);
    }
    
    static void bfs(int startNode) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(startNode);
        visited[startNode] = true;

        while (!q.isEmpty()) {
            int currentNode = q.poll();
            System.out.print(currentNode + " -> ");
            
            // Queue의 poll이라 graph의 addAll 한 순서대로 뽑힘
            for (int nextNode : graph[currentNode]) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    q.offer(nextNode);
                }
            }
        }
    }

}
