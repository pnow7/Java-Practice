package test.test11.test1125;

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

public class Main7562 {
    
    private static int[][] board;
    private static boolean[][] visited;
    
    private static final int[] DX = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static final int[] DY = {1, -1, 2, -2, 2, -2, 1, -1};
    
    private static class Knight {
        int x;
        int y;
        
        Knight(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int l = Integer.parseInt(br.readLine());
         
            board = new int[l][l];
            visited = new boolean[l][l];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            
            Knight startNight = new Knight(startX, startY);
            
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            
            Knight endNight = new Knight(endX, endY);
            
            bfs(startNight, endNight);
            System.out.println(board[endNight.x][endNight.y]);
        }
        
        br.close();
    }
    
    static void bfs(Knight start, Knight end) {
        Queue<Knight> q = new ArrayDeque<>();

        visited[start.x][start.y] = true;
        q.offer(start);
        
        while (!q.isEmpty()) {
        	Knight current = q.poll();
            
            if (current.x == end.x && current.y == end.y) break;
            
            for (int i = 0; i < 8; i++) {
                int nx = current.x + DX[i];
                int ny = current.y + DY[i];
                
                if ((0 <= nx && nx < board.length) && (0 <= ny && ny < board[0].length)) {
                    if (visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        board[nx][ny] = board[current.x][current.y] + 1;
                        q.offer(new Knight(nx, ny));
                    }
                }
            }
        }
    }
    
}