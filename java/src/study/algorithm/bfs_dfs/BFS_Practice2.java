package study.algorithm.bfs_dfs;

import java.util.*;

public class BFS_Practice2 {
    static int N = 5;
    static int M = 6;

    // 0: 벽, 1: 통로
    static int[][] wall = {
        {1, 0, 1, 1, 1, 1},
        {1, 0, 1, 0, 1, 0},
        {1, 0, 1, 0, 1, 1},
        {1, 1, 1, 1, 0, 1},
        {0, 0, 0, 0, 0, 1}
    };

    static int[][] distance = new int[N][M];

    // 상하좌우 (행, 열)
    static int[] rowState = {-1, 1, 0, 0};
    static int[] colState = {0, 0, -1, 1};

    // 좌표 저장 클래스 (Queue에 넣을 값)
    static class Node {
        int r, c;
        public Node(int r, int c) {
           this.r = r;
           this.c = c;
        }
    }

    public static void main(String[] args) {
        bfs(0, 0);

        // 도착점 거리
        System.out.println("최소 이동 칸 수: " + distance[N - 1][M - 1]);
    }

    static void bfs(int startR, int startC) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(startR, startC));

        // 시작 칸의 거리 1
        distance[startR][startC] = 1;

        while(!q.isEmpty()) {
            Node current = q.poll();

            // 4방향
            for (int i = 0; i < 4; i++) {
                int nextR = current.r + rowState[i];
                int nextC = current.c + colState[i];

                if (nextR >= 0 && nextR < N && nextC >= 0 && nextC < M && wall[nextR][nextC] == 1 && distance[nextR][nextC] == 0) {
                    distance[nextR][nextC] = distance[current.r][current.c] + 1;

                    q.offer(new Node(nextR, nextC));
                }
            }
        }
    }

}
