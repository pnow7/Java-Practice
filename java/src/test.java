/*

- 미로탐색

[입력]
4 6
101111
101010
101011
111011

[출력]
15

*/

import java.io.*;
import java.util.*;

public class test {
    
    static int N, M;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String strNum = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = Character.getNumericValue(strNum.charAt(j));
            }
        }

        BFS(0, 0);

        System.out.println(miro[N - 1][M - 1]);
        br.close();
    }

    static void BFS(int startX, int startY) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(startX, startY));
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            Node currentNode = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = currentNode.x + dx[i];
                int nextY = currentNode.y + dy[i];

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) {
                    continue;
                }

                if (visited[nextX][nextY] == true) {
                    continue;
                }

                if (miro[nextX][nextY] == 0) {
                    continue;
                }

                q.offer(new Node(nextX, nextY));
                visited[nextX][nextY] = true;
                miro[nextX][nextY] = miro[currentNode.x][currentNode.y] + 1;
            }
        }
    }

}