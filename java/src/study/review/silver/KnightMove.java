package study.review.silver;

/*
- 나이트의 이동

체스판 위에 한 나이트가 놓여져 있다. 
나이트가 이동하려고 하는 칸이 주어진다. 나이트는 몇 번 움직이면 이 칸으로 이동할 수 있을까?

각 테스트 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력한다.

입력의 첫째 줄에는 테스트 케이스의 개수가 주어진다
각 테스트 케이스는 세 줄로 이루어져 있다. 첫째 줄에는 체스판의 한 변의 길이 l
 둘째 줄과 셋째 줄에는 나이트가 현재 있는 칸, 나이트가 이동하려고 하는 칸이 주어진다.

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

public class KnightMove {
    
    static int[][] chess;
    static boolean[][] visited;
    
    static class Knight {
        int x;
        int y;
        
        public Knight(int x, int y) {
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
            
            Knight startNight = new Knight(startX, startY);
            
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            
            Knight endNight = new Knight(endX, endY);
            
            bfs(startNight, endNight);
            System.out.println(chess[endNight.x][endNight.y]);
        }
        
        br.close();
    }
    
    static void bfs(Knight start, Knight end) {
        Queue<Knight> q = new ArrayDeque<>();
        
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
        
        visited[start.x][start.y] = true;
        q.offer(start);
        
        while (!q.isEmpty()) {
        	Knight current = q.poll();
            
            if (current.x == end.x && current.y == end.y) break;
            
            for (int i = 0; i < 8; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                if ((0 <= nx && nx < chess.length) && (0 <= ny && ny < chess[0].length)) {
                    if (visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        chess[nx][ny] = chess[current.x][current.y] + 1;
                        q.offer(new Knight(nx, ny));
                    }
                }
            }
        }
    }
    
}
