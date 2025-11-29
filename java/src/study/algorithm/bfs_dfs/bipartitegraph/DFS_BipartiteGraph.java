package study.algorithm.bfs_dfs.bipartitegraph;

import java.io.*;
import java.util.*;

public class DFS_BipartiteGraph {
	
	// 미방문: 0, 그룹1: 1, 그룹2: 2
    private static int[] color; 
    private static ArrayList<Integer>[] graph;
    private static boolean isBipartite; 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int k = Integer.parseInt(br.readLine());
        
        while (k-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            color = new int[v + 1];
            graph = new ArrayList[v + 1];
            
            for (int i = 1; i <= v; i++) {
                graph[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); 
                int y = Integer.parseInt(st.nextToken());
                
                graph[x].add(y);
                graph[y].add(x);
            }
            
            isBipartite = true;
            
            for (int i = 1; i < v + 1; i++) {
                if (!isBipartite) break; 

                // 시작 정점을 그룹 1로 색칠하고 DFS 시작
                if (color[i] == 0) {
                    dfs(i, 1); 
                }
            }
            
            sb.append(isBipartite ? "YES" : "NO").append("\n");
        }
        
        System.out.print(sb.toString());
        br.close();
    }
    
    private static void dfs(int cur, int c) {
        // 이미 이분 그래프가 아님면 바로 종료
        if (!isBipartite) return; 
        
        color[cur] = c; 
        int nextColor = (c == 1) ? 2 : 1;
            
        for (int next : graph[cur]) {
        		// 미방문
            if (color[next] == 0) {
            		// 반대 색깔로 칠하고 DFS 시작
                dfs(next, nextColor); 
                
                // 재귀 후 돌아왔을 때 이미 isBipartite가 false라면 더 이상 진행할 필요 없음
                if (!isBipartite) return; 
            } 
            // 같은색 확인
            else if (color[next] == c) {
                isBipartite = false; // 이분 그래프가 아님을 표시
                return; 
            }
        }
    }
    
}