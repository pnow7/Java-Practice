package study.algorithm.bfs_dfs.bfs;

/*
- 나이트의 이동

나이트가 한 번 이동할때는 1칸 이동 후 대각선 이동을 함.

첫째줄 테스트 케이스 개수 T

각 테스트 케이스는 세 줄로 이루어져 있음.
첫째 줄에는 체스판의 한 변의 길이 l (체스판 크기는 l x l)
둘째줄에는 나이트가 현재 있는 칸
셋째줄에는 나이트가 이동하려는 하는 칸

[입력]
3
8
0 0
7 0
100
0 0
30 50
10
1 1
1 1

[출력]
5
28
0

*/

import java.io.*;
import java.util.*;

public class BFS_MoveNight {
    
    static int[][] chess;
    static boolean[][] visited;
    
    static class Night {
        int x;
        int y;
        
        public Night(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int l = Integer.parseInt(br.readLine());
         
            chess = new int[l][l];
            visited = new boolean[l][l];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            
            Night startNight = new Night(startX, startY);
            
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            
            Night endNight = new Night(endX, endY);
            
            bfs(startNight, endNight);
            System.out.println(chess[endNight.x][endNight.y]);
        }
        
        br.close();
    }
    
    static void bfs(Night start, Night end) {
        Queue<Night> q = new ArrayDeque<>();
        
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
        
        visited[start.x][start.y] = true;
        q.offer(start);
        
        while (!q.isEmpty()) {
            Night current = q.poll();
            
            if (current.x == end.x && current.y == end.y) break;
            
            for (int i = 0; i < 8; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                if ((0 <= nx && nx < chess.length) && (0 <= ny && ny < chess[0].length)) {
                    if (visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        chess[nx][ny] = chess[current.x][current.y] + 1;
                        q.offer(new Night(nx, ny));
                    }
                }
            }
        }
    }
    
}