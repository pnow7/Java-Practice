package study.algorithm.bfs_dfs;

import java.util.*;

public class DFS_Practice {
    
    static List<Integer>[] graph = new ArrayList[9];
    static boolean[] visited = new boolean[9];

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            graph[i] = new ArrayList<>();
        }

        // BFS랑 다르게 graph의 인덱스 위치를 찾고 시작함
        graph[1].addAll(Arrays.asList(2, 3, 8));
        graph[2].addAll(Arrays.asList(1, 7));
        graph[3].addAll(Arrays.asList(1, 4, 5));
        graph[4].addAll(Arrays.asList(3, 5));
        graph[5].addAll(Arrays.asList(3, 4));
        graph[6].addAll(Arrays.asList(7, 8));
        graph[7].addAll(Arrays.asList(2, 6));
        graph[8].addAll(Arrays.asList(1, 6));

        int startNode = 1;

        System.out.println("DFS 탐색 순서 (시작 노드: " + startNode + ")");
        dfs(startNode);
    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;

        System.out.print(nodeIndex + " -> ");

        for (int nextNode : graph[nodeIndex]) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}
